// ---------------------------------------------------------------------------
// Generates the four production secrets for the Supabase Edge Function secret
// store (step 3 of the deploy runbook).
//
//     node tools\gen-keys.js
//
// Nothing is written to disk and nothing leaves this process except what you
// copy. Paste each NAME=VALUE pair into:
//   https://supabase.com/dashboard/project/ckyfcwbnakbaitzurnze/functions/secrets
//
// Only LICENSE_SIGNING_PUBLIC is safe to keep in your notes (it goes in the
// APK). The other three must never leave Supabase.
//
// NOTE: the Ed25519 keypair here is generated FRESH. The dev pair that lives in
// license/keys/ has been sitting in this workspace -- treat it as burned and do
// not reuse it for production.
// ---------------------------------------------------------------------------
import { generateKeyPairSync, randomBytes } from 'node:crypto';

const { privateKey, publicKey } = generateKeyPairSync('ed25519');

const secrets = {
  LICENSE_SIGNING_PRIVATE: privateKey.export({ type: 'pkcs8', format: 'der' }).toString('base64'),
  LICENSE_SIGNING_PUBLIC: publicKey.export({ type: 'spki', format: 'der' }).toString('base64'),
  MASTER_SEAL_KEY: randomBytes(32).toString('base64'),
  ADMIN_SESSION_SECRET: randomBytes(32).toString('base64'),
};

for (const name of Object.keys(secrets)) {
  // Plain concatenation, no template literals, so the output is stable across shells.
  console.log(name + '=' + secrets[name]);
}

console.log('');
console.log('Save LICENSE_SIGNING_PUBLIC in your notes (needed for step 6).');
console.log('Do NOT screenshot this window while the private key is visible.');
