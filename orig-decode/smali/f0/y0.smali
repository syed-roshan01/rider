.class public abstract Lf0/y0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf0/x0;

.field public static final b:Lo1/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/x0;

    invoke-direct {v0}, Lf0/x0;-><init>()V

    sput-object v0, Lf0/y0;->a:Lf0/x0;

    new-instance v0, Lo1/a;

    sget v1, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۧۥۡ۠:I

    xor-int/lit16 v1, v1, -0x36a

    invoke-direct {v0, v1}, Lo1/a;-><init>(I)V

    sput-object v0, Lf0/y0;->b:Lo1/a;

    return-void
.end method
