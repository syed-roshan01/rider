.class public final Lcom/google/android/gms/common/internal/o;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ll/t;

.field public static final c:Lcom/google/android/gms/common/internal/o;


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll/t;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/common/internal/o;->b:Ll/t;

    new-instance v0, Lcom/google/android/gms/common/internal/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/common/internal/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sput-object v0, Lcom/google/android/gms/common/internal/o;->c:Lcom/google/android/gms/common/internal/o;

    return-void
.end method
