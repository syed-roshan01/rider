/* Ride Accepter — license admin dashboard */
(() => {
  'use strict';

  const $ = (s, r = document) => r.querySelector(s);
  const $$ = (s, r = document) => [...r.querySelectorAll(s)];

  // ------------------------------------------------------------------ http
  async function api(path, opts = {}) {
    const res = await fetch(path, {
      credentials: 'same-origin',
      headers: { 'content-type': 'application/json' },
      ...opts,
      body: opts.body ? JSON.stringify(opts.body) : undefined,
    });
    if (res.status === 401 && path !== '/api/admin/login') {
      showLogin();
      throw new Error('Session expired — please sign in again');
    }
    const data = await res.json().catch(() => ({}));
    if (!res.ok) throw new Error(data.error || data.reason || `HTTP ${res.status}`);
    return data;
  }

  // ------------------------------------------------------------------ ui bits
  let toastTimer;
  function toast(msg, kind = 'ok') {
    const t = $('#toast');
    t.textContent = msg;
    t.className = `toast ${kind}`;
    t.hidden = false;
    clearTimeout(toastTimer);
    toastTimer = setTimeout(() => (t.hidden = true), 3200);
  }

  function modal(title, html) {
    $('#modal-title').textContent = title;
    $('#modal-body').innerHTML = html;
    $('#modal').hidden = false;
  }
  $('#modal-close').onclick = () => ($('#modal').hidden = true);
  $('#modal').onclick = (e) => { if (e.target.id === 'modal') $('#modal').hidden = true; };
  document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape' && !$('#modal').hidden) $('#modal').hidden = true;
  });

  const esc = (s) => String(s ?? '').replace(/[&<>"']/g, (c) =>
    ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));

  const fmtDate = (ms) => (ms ? new Date(ms).toLocaleString() : '—');

  function countdown(ms) {
    if (ms == null) return '—';
    const d = ms - Date.now();
    if (d <= 0) return 'expired';
    const days = Math.floor(d / 86400000);
    const hrs = Math.floor((d % 86400000) / 3600000);
    return days > 0 ? `${days}d ${hrs}h` : `${hrs}h ${Math.floor((d % 3600000) / 60000)}m`;
  }

  async function copy(text) {
    try {
      await navigator.clipboard.writeText(text);
      toast('Copied to clipboard');
    } catch {
      modal('License key', `<p class="mono">${esc(text)}</p>`);
    }
  }

  // ------------------------------------------------------------------ login
  function showLogin() {
    $('#app').hidden = true;
    $('#login').hidden = false;
    $('#password').value = '';
    $('#password').focus();
  }

  $('#login-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    $('#login-error').hidden = true;
    try {
      await api('/api/admin/login', { method: 'POST', body: { password: $('#password').value } });
      $('#login').hidden = true;
      $('#app').hidden = false;
      await refreshAll();
    } catch {
      $('#login-error').hidden = false;
    }
  });

  $('#logout').onclick = async () => {
    try { await api('/api/admin/logout', { method: 'POST', body: {} }); } catch {}
    showLogin();
  };

  // ------------------------------------------------------------------ tabs
  $('#tabs').addEventListener('click', (e) => {
    const btn = e.target.closest('.tab');
    if (!btn) return;
    $$('.tab').forEach((b) => b.classList.toggle('active', b === btn));
    $$('section[data-panel]').forEach((s) => (s.hidden = s.dataset.panel !== btn.dataset.tab));
    if (btn.dataset.tab === 'devices') loadDevices();
    if (btn.dataset.tab === 'audit') loadAudit();
  });

  // ------------------------------------------------------------------ stats
  async function loadStats() {
    const s = await api('/api/admin/stats');
    $('#stats').innerHTML = [
      ['Total keys', s.total, ''],
      ['Active', s.active, 'ok'],
      ['Expiring < 7d', s.expiringSoon, 'warn'],
      ['Expired', s.expired, 'warn'],
      ['Revoked', s.revoked, 'bad'],
      ['Unused', s.unused, ''],
      ['Bound devices', s.devices, ''],
    ].map(([l, n, cls]) => `<div class="stat ${cls}"><div class="l">${l}</div><div class="n">${n ?? 0}</div></div>`).join('');
  }

  // ------------------------------------------------------------------ keys
  const PLAN_DAYS = { DAY: 1, WEEK: 7, HALF_MONTH: 15, MONTH: 30, YEAR: 365 };

  $('#f-plan').addEventListener('change', () => {
    $('#f-days').value = PLAN_DAYS[$('#f-plan').value];
  });

  $('#create-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    try {
      const r = await api('/api/admin/licenses', {
        method: 'POST',
        body: {
          count: Number($('#f-count').value),
          planType: $('#f-plan').value,
          durationDays: Number($('#f-days').value),
          deviceCodes: $('#f-devids').value.split(/[,;\n]+/).map((s) => s.trim()).filter(Boolean),
          maxDevices: Number($('#f-devices').value),
          note: $('#f-note').value,
        },
      });
      const rows = r.created.map((c) => `
        <div class="key-row">
          <span class="mono">${esc(c.key)}</span>
          <button class="btn tiny" data-copy="${esc(c.key)}">Copy</button>
        </div>`).join('');
      modal(
        `${r.created.length} key${r.created.length > 1 ? 's' : ''} created`,
        `<div class="warning">Copy these now — they are stored only as a hash and are never shown again.</div>
         <div class="key-list">${rows}</div>`,
      );
      $('#modal-body').onclick = (ev) => {
        const b = ev.target.closest('[data-copy]');
        if (b) copy(b.dataset.copy);
      };
      $('#f-note').value = '';
      await Promise.all([loadStats(), loadKeys()]);
    } catch (err) {
      toast(err.message, 'bad');
    }
  });

  let searchTimer;
  $('#search').addEventListener('input', () => {
    clearTimeout(searchTimer);
    searchTimer = setTimeout(loadKeys, 250);
  });
  $('#status-filter').addEventListener('change', loadKeys);
  $('#reload').onclick = () => Promise.all([loadStats(), loadKeys()]);

  async function loadKeys() {
    const q = encodeURIComponent($('#search').value.trim());
    const st = encodeURIComponent($('#status-filter').value);
    const data = await api(`/api/admin/licenses?q=${q}&status=${st}&limit=250`);
    $('#keys-count').textContent = `${data.total} key${data.total === 1 ? '' : 's'}`;
    const tb = $('#keys-table tbody');
    if (!data.rows.length) {
      tb.innerHTML = `<tr><td colspan="7" class="empty">No keys match. Generate one above.</td></tr>`;
      return;
    }
    tb.innerHTML = data.rows.map((r) => {
      const expiredish = r.status === 'active' && r.expiresAt && r.expiresAt <= Date.now();
      const status = expiredish ? 'expired' : r.status;
      return `<tr>
        <td class="mono">${esc(r.keyPrefix)}…</td>
        <td>${esc(r.planType)}<div class="muted small">${r.durationDays}d</div></td>
        <td><span class="pill ${status}">${status}</span></td>
        <td>${fmtDate(r.expiresAt)}<div class="muted small">${countdown(r.expiresAt)}</div></td>
        <td class="mono">${(r.boundDeviceCodeHashes ?? []).length || r.maxDevices}</td>
        <td>${esc(r.note) || '<span class="muted">—</span>'}</td>
        <td><div class="actions">
          <button class="btn tiny" data-act="reveal" data-k="${r.keyHash}">Reveal</button>
          <button class="btn tiny" data-act="extend" data-k="${r.keyHash}">+30d</button>
          ${status === 'revoked'
            ? `<button class="btn tiny" data-act="unrevoke" data-k="${r.keyHash}">Restore</button>`
            : `<button class="btn tiny danger" data-act="revoke" data-k="${r.keyHash}">Revoke</button>`}
          <button class="btn tiny danger" data-act="delete" data-k="${r.keyHash}">Delete</button>
        </div></td>
      </tr>`;
    }).join('');
  }

  $('#keys-table').addEventListener('click', async (e) => {
    const b = e.target.closest('[data-act]');
    if (!b) return;
    const k = b.dataset.k;
    try {
      switch (b.dataset.act) {
        case 'reveal': {
          const r = await api(`/api/admin/licenses/${k}/reveal`, { method: 'POST', body: {} });
          modal('License key', `
            <div class="warning">Do not share this — it is the customer's credential.</div>
            <div class="key-row"><span class="mono">${esc(r.key)}</span>
            <button class="btn tiny" id="copy-reveal">Copy</button></div>`);
          $('#copy-reveal').onclick = () => copy(r.key);
          break;
        }
        case 'extend':
          await api(`/api/admin/licenses/${k}/extend`, { method: 'POST', body: { days: 30 } });
          toast('Extended by 30 days');
          break;
        case 'revoke':
          await api(`/api/admin/licenses/${k}/revoke`, { method: 'POST', body: {} });
          toast('Revoked — effective on the next validation');
          break;
        case 'unrevoke':
          await api(`/api/admin/licenses/${k}/unrevoke`, { method: 'POST', body: {} });
          toast('Restored');
          break;
        case 'delete':
          if (!confirm('Permanently delete this key and unbind its devices?')) return;
          await api(`/api/admin/licenses/${k}/delete`, { method: 'POST', body: {} });
          toast('Deleted');
          break;
      }
      await Promise.all([loadStats(), loadKeys()]);
    } catch (err) {
      toast(err.message, 'bad');
    }
  });

  // ------------------------------------------------------------------ devices
  async function loadDevices() {
    const rows = await api('/api/admin/devices');
    const tb = $('#devices-table tbody');
    if (!rows.length) {
      tb.innerHTML = `<tr><td colspan="7" class="empty">No devices bound yet.</td></tr>`;
      return;
    }
    tb.innerHTML = rows.map((d) => `<tr>
      <td class="mono">${esc(d.hwidHash.slice(0, 16))}…</td>
      <td class="mono">${esc(d.keyHash.slice(0, 8))}…</td>
      <td>${esc(d.brand)} ${esc(d.model)}</td>
      <td><span class="pill ${/MEETS|GOOD|PASS/i.test(d.integrity) ? 'good' : 'bad'}">${esc(d.integrity) || 'unknown'}</span></td>
      <td>${esc(d.appVersion) || '—'}</td>
      <td>${fmtDate(d.lastSeenAt)}</td>
      <td><button class="btn tiny danger" data-unbind="${esc(d.hwidHash)}">Unbind</button></td>
    </tr>`).join('');
    $('#devices-table').onclick = async (e) => {
      const b = e.target.closest('[data-unbind]');
      if (!b) return;
      if (!confirm('Unbind this device and free its slot?')) return;
      try {
        await api(`/api/admin/devices/${b.dataset.unbind}`, { method: 'DELETE' });
        toast('Device unbound');
        await Promise.all([loadStats(), loadDevices()]);
      } catch (err) { toast(err.message, 'bad'); }
    };
  }

  // ------------------------------------------------------------------ config
  async function loadConfig() {
    const c = await api('/api/admin/config');
    $('#c-maintenance').checked = !!c.maintenanceMode;
    $('#c-maintmsg').value = c.maintenanceMessage ?? '';
    $('#c-forcever').value = c.forceUpdateVersion ?? 0;
    $('#c-download').value = c.updateDownloadUrl ?? '';
    $('#c-page').value = c.updatePageUrl ?? '';
    $('#c-blocked').value = (c.versionBlocked ?? []).join(', ');
    $('#c-minfare').value = c.minAllowedFare ?? 10;
    $('#c-maxfare').value = c.maxAllowedFare ?? 5000;
    $('#c-dialog').value = c.dialogMessage ?? '';
    $('#c-dialogbtn').value = c.dialogButtonText ?? 'OK';
  }

  $('#config-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    try {
      await api('/api/admin/config', {
        method: 'POST',
        body: {
          maintenanceMode: $('#c-maintenance').checked,
          maintenanceMessage: $('#c-maintmsg').value,
          forceUpdateVersion: Number($('#c-forcever').value),
          updateDownloadUrl: $('#c-download').value,
          updatePageUrl: $('#c-page').value,
          versionBlocked: $('#c-blocked').value.split(',').map((s) => s.trim()).filter(Boolean),
          minAllowedFare: Number($('#c-minfare').value),
          maxAllowedFare: Number($('#c-maxfare').value),
          dialogMessage: $('#c-dialog').value,
          dialogButtonText: $('#c-dialogbtn').value,
        },
      });
      toast('Pushed to all installs');
    } catch (err) { toast(err.message, 'bad'); }
  });

  // ------------------------------------------------------------------ audit
  async function loadAudit() {
    const rows = await api('/api/admin/audit?limit=300');
    const tb = $('#audit-table tbody');
    tb.innerHTML = rows.length
      ? rows.map((a) => `<tr>
          <td>${fmtDate(a.at)}</td>
          <td class="mono">${esc(a.actor)}</td>
          <td>${esc(a.action)}</td>
          <td>${esc(a.detail)}</td>
        </tr>`).join('')
      : `<tr><td colspan="4" class="empty">Nothing recorded yet.</td></tr>`;
  }
  $('#audit-reload').onclick = loadAudit;

  // ------------------------------------------------------------------ boot
  async function refreshAll() {
    await Promise.all([loadStats(), loadKeys(), loadConfig()]);
  }

  // resume an existing session on reload
  (async () => {
    try {
      await api('/api/admin/stats');
      $('#login').hidden = true;
      $('#app').hidden = false;
      await refreshAll();
    } catch {
      showLogin();
    }
  })();
})();
