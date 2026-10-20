.class public final Lv0/h;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lv0/j;


# direct methods
.method public constructor <init>(Lv0/j;)V
    .locals 0

    iput-object p1, p0, Lv0/h;->a:Lv0/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv0/h;->a:Lv0/j;

    iget-object v0, v0, Lv0/j;->c:Lv0/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lv0/l;->a(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
