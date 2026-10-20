.class public final Lt/c;
.super Lw8/i;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lt/d;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt/d;Ljava/lang/Object;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lt/c;->a:Lt/d;

    iput-object p2, p0, Lt/c;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lt/c;

    iget-object v1, p0, Lt/c;->a:Lt/d;

    iget-object v2, p0, Lt/c;->b:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Lt/c;-><init>(Lt/d;Ljava/lang/Object;Lu8/e;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu8/e;

    invoke-virtual {p0, p1}, Lt/c;->create(Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/c;

    sget-object v0, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, v0}, Lt/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/c;->a:Lt/d;

    invoke-static {p1}, Lt/d;->a(Lt/d;)V

    iget-object v0, p0, Lt/c;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lt/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lt/d;->c:Lt/o;

    iget-object v1, v1, Lt/o;->b:Lm0/n1;

    invoke-virtual {v1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lt/d;->e:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
