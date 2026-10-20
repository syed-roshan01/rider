.class public final La0/n0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:La0/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La0/n0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, La0/n0;->a:La0/n0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv0/d;

    check-cast p2, La0/o0;

    invoke-virtual {p2}, La0/o0;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method
