.class public final Lh0/f0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Ld9/q;


# direct methods
.method public synthetic constructor <init>(Ld9/q;)V
    .locals 0

    iput-object p1, p0, Lh0/f0;->a:Ld9/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lo1/o;

    iget-boolean p1, p1, Lo1/o;->w:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh0/f0;->a:Ld9/q;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ld9/q;->a:Z

    sget-object p1, Lt1/t1;->c:Lt1/t1;

    goto :goto_0

    :cond_0
    sget-object p1, Lt1/t1;->a:Lt1/t1;

    :goto_0
    return-object p1
.end method
