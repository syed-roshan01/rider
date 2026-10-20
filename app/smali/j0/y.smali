.class public abstract Lj0/y;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/m3;

.field public static final b:Lj0/h;

.field public static final c:Lj0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lj0/x;->a:Lj0/x;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lj0/y;->a:Lm0/m3;

    new-instance v0, Lj0/h;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, Lj0/h;-><init>(FFFF)V

    sput-object v0, Lj0/y;->b:Lj0/h;

    new-instance v0, Lj0/h;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, Lj0/h;-><init>(FFFF)V

    sput-object v0, Lj0/y;->c:Lj0/h;

    return-void
.end method
