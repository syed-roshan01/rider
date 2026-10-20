.class public final Lb6/b;
.super Lcom/google/android/gms/common/api/i;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lw5/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lw5/b;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lb6/b;->a:Lcom/google/android/gms/common/api/f;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/internal/t;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/common/api/internal/t;->a()Lcom/google/android/gms/common/api/internal/s;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/base/zad;->zaa:Lz5/d;

    filled-new-array {v1}, [Lz5/d;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/s;->a:Z

    new-instance v1, Lk/f;

    const/16 v2, 0x19

    invoke-direct {v1, p1, v2}, Lk/f;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/i;->doBestEffortWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
