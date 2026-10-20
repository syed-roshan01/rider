.class public final Lcom/google/android/recaptcha/internal/zzcd;
.super Ljava/lang/Object;


# instance fields
.field private final zza:Landroid/webkit/WebView;

.field private final zzb:Lm9/d0;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lm9/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcd;->zza:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzcd;->zzb:Lm9/d0;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzcd;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcd;->zza:Landroid/webkit/WebView;

    return-object p0
.end method


# virtual methods
.method public final varargs zzb(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzcc;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lcom/google/android/recaptcha/internal/zzcc;-><init>([Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Lu8/e;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcd;->zzb:Lm9/d0;

    const/4 p2, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, p2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method
