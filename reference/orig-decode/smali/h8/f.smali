.class public abstract Lh8/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lj8/c;

.field public static final b:Lj8/c;

.field public static final c:Lj8/c;

.field public static final d:Lj8/c;

.field public static final e:Lj8/c;

.field public static final f:Lj8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj8/c;

    sget-object v1, Lj8/c;->g:Lja/j;

    const-string v2, "https"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->a:Lj8/c;

    new-instance v0, Lj8/c;

    const-string v2, "http"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->b:Lj8/c;

    new-instance v0, Lj8/c;

    sget-object v1, Lj8/c;->e:Lja/j;

    const-string v2, "POST"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->c:Lj8/c;

    new-instance v0, Lj8/c;

    const-string v2, "GET"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Lja/j;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->d:Lj8/c;

    new-instance v0, Lj8/c;

    sget-object v1, Lg8/s1;->i:Le8/g1;

    iget-object v1, v1, Le8/i1;->a:Ljava/lang/String;

    const-string v2, "application/grpc"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->e:Lj8/c;

    new-instance v0, Lj8/c;

    const-string v1, "te"

    const-string v2, "trailers"

    invoke-direct {v0, v1, v2}, Lj8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lh8/f;->f:Lj8/c;

    return-void
.end method
