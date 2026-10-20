.class public Lz5/z;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lz5/z;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz5/z;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lz5/z;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    sput-object v0, Lz5/z;->d:Lz5/z;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz5/z;->a:Z

    iput-object p2, p0, Lz5/z;->b:Ljava/lang/String;

    iput-object p3, p0, Lz5/z;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz5/z;->b:Ljava/lang/String;

    return-object v0
.end method
