.class public final Lx9/g;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lq8/k;

.field public static final c:Lt1/p;

.field public static final d:Ljava/util/LinkedHashMap;

.field public static final e:Lx9/g;

.field public static final f:Lx9/g;

.field public static final g:Lx9/g;

.field public static final h:Lx9/g;

.field public static final i:Lx9/g;

.field public static final j:Lx9/g;

.field public static final k:Lx9/g;

.field public static final l:Lx9/g;

.field public static final m:Lx9/g;

.field public static final n:Lx9/g;

.field public static final o:Lx9/g;

.field public static final p:Lx9/g;

.field public static final q:Lx9/g;

.field public static final r:Lx9/g;

.field public static final s:Lx9/g;

.field public static final t:Lx9/g;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq8/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx9/g;->b:Lq8/k;

    new-instance v1, Lt1/p;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lt1/p;-><init>(I)V

    sput-object v1, Lx9/g;->c:Lt1/p;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, Lx9/g;->d:Ljava/util/LinkedHashMap;

    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->e:Lx9/g;

    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->f:Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->g:Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->h:Lx9/g;

    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->i:Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_FALLBACK_SCSV"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->j:Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->k:Lx9/g;

    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->l:Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->m:Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->n:Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->o:Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->p:Lx9/g;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->q:Lx9/g;

    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->r:Lx9/g;

    const-string v1, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->s:Lx9/g;

    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    move-result-object v1

    sput-object v1, Lx9/g;->t:Lx9/g;

    const-string v1, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    invoke-static {v0, v1}, Lq8/k;->a(Lq8/k;Ljava/lang/String;)Lx9/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx9/g;->a:Ljava/lang/String;

    return-object v0
.end method
