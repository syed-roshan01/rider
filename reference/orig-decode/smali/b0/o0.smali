.class public abstract Lb0/o0;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:Lb0/x;

.field public static final c:Lb0/m0;

.field public static final d:Lb0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lb0/o0;->a:F

    sget-object v2, Lr8/r;->a:Lr8/r;

    sget-object v6, Lv/h1;->b:Lv/h1;

    new-instance v15, Lz/h0;

    const/4 v0, 0x1

    invoke-direct {v15, v0}, Lz/h0;-><init>(I)V

    new-instance v0, Lb0/x;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v16}, Lb0/x;-><init>(Ljava/util/List;IIILv/h1;IIILb0/g;Lb0/g;FIZLr1/k0;Z)V

    sput-object v0, Lb0/o0;->b:Lb0/x;

    new-instance v0, Lb0/m0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb0/o0;->c:Lb0/m0;

    new-instance v0, Lb0/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb0/l0;-><init>(I)V

    sput-object v0, Lb0/o0;->d:Lb0/l0;

    return-void
.end method
