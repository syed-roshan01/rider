.class public final Lv/c2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lv/l2;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lv/l2;JLu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/c2;->b:Lv/l2;

    iput-wide p2, p0, Lv/c2;->c:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lv/c2;

    iget-object v1, p0, Lv/c2;->b:Lv/l2;

    iget-wide v2, p0, Lv/c2;->c:J

    invoke-direct {v0, v1, v2, v3, p2}, Lv/c2;-><init>(Lv/l2;JLu8/e;)V

    iput-object p1, v0, Lv/c2;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/c2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/c2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/c2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/c2;->a:Ljava/lang/Object;

    check-cast p1, Lv/r1;

    const/4 v0, 0x4

    iget-object v1, p0, Lv/c2;->b:Lv/l2;

    iget-wide v2, p0, Lv/c2;->c:J

    invoke-virtual {v1, p1, v2, v3, v0}, Lv/l2;->a(Lv/r1;JI)J

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
