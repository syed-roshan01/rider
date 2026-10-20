.class public abstract Lz/j0;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:Lz/w;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Lz/j0;->a:F

    new-instance v6, Lz/h0;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lz/h0;-><init>(I)V

    sget-object v9, Lr8/r;->a:Lr8/r;

    new-instance v0, Lz/w;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Lz/w;-><init>(Lz/x;IZFLr1/k0;FZLjava/util/List;IIII)V

    sput-object v0, Lz/j0;->b:Lz/w;

    return-void
.end method
