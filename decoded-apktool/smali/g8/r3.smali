.class public final Lg8/r3;
.super Le8/o0;


# instance fields
.field public final b:Lg8/s3;


# direct methods
.method public constructor <init>(Lg8/s3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/r3;->b:Lg8/s3;

    return-void
.end method


# virtual methods
.method public final a()Ll/z2;
    .locals 4

    new-instance v0, Lv6/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv6/d;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lg8/r3;->b:Lg8/s3;

    const-string v2, "config"

    invoke-static {v1, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, v0, Lv6/d;->b:Ljava/lang/Object;

    new-instance v2, Ll/z2;

    sget-object v3, Le8/c2;->e:Le8/c2;

    iget-object v0, v0, Lv6/d;->c:Ljava/lang/Object;

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    invoke-direct {v2, v3, v1}, Ll/z2;-><init>(Le8/c2;Ljava/lang/Object;)V

    return-object v2
.end method
