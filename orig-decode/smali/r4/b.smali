.class public final Lr4/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lq8/c;

.field public final b:Lq8/c;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Lx9/q;


# direct methods
.method public constructor <init>(Lja/a0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lq8/d;->a:[Lq8/d;

    new-instance v0, Lr4/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr4/a;-><init>(Lr4/b;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->a:Lq8/c;

    .line 3
    new-instance v0, Lr4/a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lr4/a;-><init>(Lr4/b;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->b:Lq8/c;

    const-wide v3, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, p0, Lr4/b;->c:J

    .line 6
    invoke-virtual {p1, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, p0, Lr4/b;->d:J

    .line 8
    invoke-virtual {p1, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iput-boolean v2, p0, Lr4/b;->e:Z

    .line 10
    invoke-virtual {p1, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 12
    new-instance v2, Lx9/p;

    invoke-direct {v2}, Lx9/p;-><init>()V

    move v5, v1

    :goto_1
    if-ge v5, v0, :cond_2

    .line 13
    invoke-virtual {p1, v3, v4}, Lja/a0;->K(J)Ljava/lang/String;

    move-result-object v6

    .line 14
    sget-object v7, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    const/16 v7, 0x3a

    const/4 v8, 0x6

    .line 15
    invoke-static {v6, v7, v1, v1, v8}, Ll9/i;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    .line 16
    invoke-virtual {v6, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v9, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v8, v9}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ll9/i;->o1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "this as java.lang.String).substring(startIndex)"

    invoke-static {v6, v7}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v8, v6}, Lx9/p;->b(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const-string p1, "Unexpected header: "

    .line 17
    invoke-virtual {p1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    invoke-virtual {v2}, Lx9/p;->c()Lx9/q;

    move-result-object p1

    iput-object p1, p0, Lr4/b;->f:Lx9/q;

    return-void
.end method

.method public constructor <init>(Lx9/b0;)V
    .locals 5

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lq8/d;->a:[Lq8/d;

    new-instance v0, Lr4/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr4/a;-><init>(Lr4/b;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->a:Lq8/c;

    .line 21
    new-instance v0, Lr4/a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lr4/a;-><init>(Lr4/b;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->b:Lq8/c;

    .line 22
    iget-wide v3, p1, Lx9/b0;->r:J

    iput-wide v3, p0, Lr4/b;->c:J

    .line 23
    iget-wide v3, p1, Lx9/b0;->s:J

    iput-wide v3, p0, Lr4/b;->d:J

    .line 24
    iget-object v0, p1, Lx9/b0;->e:Lx9/o;

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    iput-boolean v1, p0, Lr4/b;->e:Z

    .line 25
    iget-object p1, p1, Lx9/b0;->f:Lx9/q;

    iput-object p1, p0, Lr4/b;->f:Lx9/q;

    return-void
.end method


# virtual methods
.method public final a(Lja/z;)V
    .locals 5

    iget-wide v0, p0, Lr4/b;->c:J

    invoke-virtual {p1, v0, v1}, Lja/z;->W(J)Lja/h;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lja/z;->C(I)Lja/h;

    iget-wide v1, p0, Lr4/b;->d:J

    invoke-virtual {p1, v1, v2}, Lja/z;->W(J)Lja/h;

    invoke-virtual {p1, v0}, Lja/z;->C(I)Lja/h;

    iget-boolean v1, p0, Lr4/b;->e:Z

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1, v2}, Lja/z;->W(J)Lja/h;

    invoke-virtual {p1, v0}, Lja/z;->C(I)Lja/h;

    iget-object v1, p0, Lr4/b;->f:Lx9/q;

    invoke-virtual {v1}, Lx9/q;->size()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lja/z;->W(J)Lja/h;

    invoke-virtual {p1, v0}, Lja/z;->C(I)Lja/h;

    invoke-virtual {v1}, Lx9/q;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    const-string v4, ": "

    invoke-virtual {p1, v4}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v1, v3}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {p1, v0}, Lja/h;->C(I)Lja/h;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
