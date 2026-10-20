.class public final Lv/x;
.super Ljava/lang/Object;

# interfaces
.implements Lv/r1;


# instance fields
.field public final synthetic a:Lv/y;


# direct methods
.method public constructor <init>(Lv/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/x;->a:Lv/y;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lv/x;->a:Lv/y;

    iget-object v0, v0, Lv/y;->a:Lc9/c;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method
