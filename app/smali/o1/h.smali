.class public final Lo1/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lo1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo1/h;->a:Lo1/h;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)J
    .locals 1

    invoke-static {p1, p2}, Le1/b;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {p1, p2}, Le1/b;->z(Landroid/view/MotionEvent;I)F

    move-result p1

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1
.end method
