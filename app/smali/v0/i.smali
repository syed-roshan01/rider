.class public final Lv0/i;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Z

.field public final c:Lv0/n;


# direct methods
.method public constructor <init>(Lv0/j;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv0/i;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv0/i;->b:Z

    iget-object v0, p1, Lv0/j;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    new-instance v0, Lv0/h;

    invoke-direct {v0, p1}, Lv0/h;-><init>(Lv0/j;)V

    sget-object p1, Lv0/o;->a:Lm0/m3;

    new-instance p1, Lv0/n;

    invoke-direct {p1, p2, v0}, Lv0/n;-><init>(Ljava/util/Map;Lc9/c;)V

    iput-object p1, p0, Lv0/i;->c:Lv0/n;

    return-void
.end method
