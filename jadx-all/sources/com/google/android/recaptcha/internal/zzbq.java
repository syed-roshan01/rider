package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import d7.a;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import l9.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq {
    private final zzh zza;
    private final zzbg zzb;

    public zzbq(zzh zzhVar, zzbg zzbgVar) {
        this.zza = zzhVar;
        this.zzb = zzbgVar;
    }

    public final zzoe zza(String str, byte[] bArr, zzbd zzbdVar) throws RecaptchaException, IOException, zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.VALIDATE_INPUT);
        zzbg zzbgVar = this.zzb;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            a.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(bArr);
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        zzoe zzoeVarZzi = zzoe.zzi(httpURLConnection.getInputStream());
                        this.zzb.zza(zzbbVarZza);
                        return zzoeVarZzi;
                    } catch (Exception unused) {
                        throw new zzp(zzn.zzc, zzl.zzR, null);
                    }
                }
                if (httpURLConnection.getResponseCode() != 400) {
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                zzoz zzozVarZzg = zzoz.zzg(httpURLConnection.getErrorStream());
                zzo zzoVar = zzp.zza;
                throw zzo.zza(zzozVarZzg.zzi());
            } catch (Exception e4) {
                if (e4 instanceof zzp) {
                    throw ((zzp) e4);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (zzp e10) {
            this.zzb.zzb(zzbbVarZza, e10, null);
            throw e10.zzc();
        }
    }

    public final String zzb(zzoe zzoeVar, zzbd zzbdVar) throws Exception {
        String strA0;
        try {
            String strZzk = zzoeVar.zzk();
            String strZzH = zzoeVar.zzH();
            if (this.zza.zzd(strZzH)) {
                zzbb zzbbVarZza = zzbdVar.zza(zzne.LOAD_CACHE_JS);
                zzbg zzbgVar = this.zzb;
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
                try {
                    strA0 = this.zza.zza(strZzH);
                    if (strA0 != null) {
                        this.zzb.zza(zzbbVarZza);
                    }
                } catch (Exception unused) {
                    this.zzb.zzb(zzbbVarZza, new zzp(zzn.zzn, zzl.zzad, null), null);
                }
                this.zzb.zzb(zzbbVarZza, new zzp(zzn.zzn, zzl.zzae, null), null);
                strA0 = null;
            } else {
                strA0 = null;
            }
            if (strA0 == null) {
                this.zza.zzb();
                zzbb zzbbVarZza2 = zzbdVar.zza(zzne.DOWNLOAD_JS);
                try {
                    zzbg zzbgVar2 = this.zzb;
                    zzbgVar2.zze.put(zzbbVarZza2, new zzbf(zzbbVarZza2, zzbgVar2.zza, new zzac()));
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(strZzk).openConnection();
                            a.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new zzp(zzn.zze, new zzl(httpURLConnection.getResponseCode()), null);
                            }
                            try {
                                strA0 = z6.a.a0(a.d("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                                this.zzb.zza(zzbbVarZza2);
                                zzbb zzbbVarZza3 = zzbdVar.zza(zzne.SAVE_CACHE_JS);
                                try {
                                    zzbg zzbgVar3 = this.zzb;
                                    zzbgVar3.zze.put(zzbbVarZza3, new zzbf(zzbbVarZza3, zzbgVar3.zza, new zzac()));
                                    this.zza.zzc(strZzH, strA0);
                                    this.zzb.zza(zzbbVarZza3);
                                } catch (Exception unused2) {
                                    this.zzb.zzb(zzbbVarZza3, new zzp(zzn.zzn, zzl.zzaf, null), null);
                                }
                            } catch (Exception unused3) {
                                throw new zzp(zzn.zze, zzl.zzab, null);
                            }
                        } catch (Exception unused4) {
                            throw new zzp(zzn.zze, zzl.zzaa, null);
                        }
                    } catch (Exception unused5) {
                        throw new zzp(zzn.zzc, zzl.zzZ, null);
                    }
                } catch (zzp e4) {
                    this.zzb.zzb(zzbbVarZza2, e4, null);
                    throw e4;
                }
            }
            return i.c1(zzoeVar.zzj(), "JAVASCRIPT_TAG", strA0);
        } catch (Exception e10) {
            if (e10 instanceof zzp) {
                throw e10;
            }
            throw new zzp(zzn.zzc, zzl.zzX, null);
        }
    }
}
