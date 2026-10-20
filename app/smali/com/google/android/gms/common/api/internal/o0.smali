.class public final Lcom/google/android/gms/common/api/internal/o0;
.super Ln6/c;

# interfaces
.implements Lcom/google/android/gms/common/api/j;
.implements Lcom/google/android/gms/common/api/k;


# static fields
.field public static final h:Lw5/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Lw5/b;

.field public final d:Ljava/util/Set;

.field public final e:Lcom/google/android/gms/common/internal/h;

.field public f:Lm6/c;

.field public g:Lcom/google/android/gms/common/api/internal/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm6/b;->a:Lw5/b;

    sput-object v0, Lcom/google/android/gms/common/api/internal/o0;->h:Lw5/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/h;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/base/zab;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/o0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/o0;->b:Landroid/os/Handler;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/o0;->e:Lcom/google/android/gms/common/internal/h;

    iget-object p1, p3, Lcom/google/android/gms/common/internal/h;->b:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/o0;->d:Ljava/util/Set;

    sget-object p1, Lcom/google/android/gms/common/api/internal/o0;->h:Lw5/b;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/o0;->c:Lw5/b;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/d;->disconnect()V

    return-void
.end method

.method public final b(Lz5/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/f0;->a(Lz5/b;)V

    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    invoke-interface {v0, p0}, Lm6/c;->a(Ln6/d;)V

    return-void
.end method
