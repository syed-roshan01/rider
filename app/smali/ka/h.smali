.class public final Lka/h;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Ld9/q;

.field public final synthetic b:J

.field public final synthetic c:Ld9/t;

.field public final synthetic d:Lja/i;

.field public final synthetic e:Ld9/t;

.field public final synthetic f:Ld9/t;


# direct methods
.method public constructor <init>(Ld9/q;JLd9/t;Lja/a0;Ld9/t;Ld9/t;)V
    .locals 0

    iput-object p1, p0, Lka/h;->a:Ld9/q;

    iput-wide p2, p0, Lka/h;->b:J

    iput-object p4, p0, Lka/h;->c:Ld9/t;

    iput-object p5, p0, Lka/h;->d:Lja/i;

    iput-object p6, p0, Lka/h;->e:Ld9/t;

    iput-object p7, p0, Lka/h;->f:Ld9/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    iget-object p1, p0, Lka/h;->a:Ld9/q;

    iget-boolean v2, p1, Ld9/q;->a:Z

    if-nez v2, :cond_4

    iput-boolean p2, p1, Ld9/q;->a:Z

    iget-wide p1, p0, Lka/h;->b:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_3

    iget-object p1, p0, Lka/h;->c:Ld9/t;

    iget-wide v0, p1, Ld9/t;->a:J

    const-wide v2, 0xffffffffL

    cmp-long p2, v0, v2

    iget-object v4, p0, Lka/h;->d:Lja/i;

    if-nez p2, :cond_0

    invoke-interface {v4}, Lja/i;->J()J

    move-result-wide v0

    :cond_0
    iput-wide v0, p1, Ld9/t;->a:J

    iget-object p1, p0, Lka/h;->e:Ld9/t;

    iget-wide v0, p1, Ld9/t;->a:J

    cmp-long p2, v0, v2

    const-wide/16 v0, 0x0

    if-nez p2, :cond_1

    invoke-interface {v4}, Lja/i;->J()J

    move-result-wide v5

    goto :goto_0

    :cond_1
    move-wide v5, v0

    :goto_0
    iput-wide v5, p1, Ld9/t;->a:J

    iget-object p1, p0, Lka/h;->f:Ld9/t;

    iget-wide v5, p1, Ld9/t;->a:J

    cmp-long p2, v5, v2

    if-nez p2, :cond_2

    invoke-interface {v4}, Lja/i;->J()J

    move-result-wide v0

    :cond_2
    iput-wide v0, p1, Ld9/t;->a:J

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
