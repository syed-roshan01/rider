.class public final Lb0/g;
.super Ljava/lang/Object;

# interfaces
.implements Lb0/h;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:J

.field public final e:Ljava/lang/Object;

.field public final f:Ly0/b;

.field public final g:Ly0/c;

.field public final h:Lm2/l;

.field public final i:Z

.field public final j:Z

.field public final k:I

.field public final l:[I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(IILjava/util/List;JLjava/lang/Object;Lv/h1;Ly0/b;Ly0/c;Lm2/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb0/g;->a:I

    iput p2, p0, Lb0/g;->b:I

    iput-object p3, p0, Lb0/g;->c:Ljava/util/List;

    iput-wide p4, p0, Lb0/g;->d:J

    iput-object p6, p0, Lb0/g;->e:Ljava/lang/Object;

    iput-object p8, p0, Lb0/g;->f:Ly0/b;

    iput-object p9, p0, Lb0/g;->g:Ly0/c;

    iput-object p10, p0, Lb0/g;->h:Lm2/l;

    iput-boolean p11, p0, Lb0/g;->i:Z

    sget-object p1, Lv/h1;->a:Lv/h1;

    const/4 p2, 0x0

    if-ne p7, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, Lb0/g;->j:Z

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    move p4, p2

    :goto_1
    if-ge p2, p1, :cond_2

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lr1/x0;

    iget-boolean p6, p0, Lb0/g;->j:Z

    if-nez p6, :cond_1

    iget p5, p5, Lr1/x0;->b:I

    goto :goto_2

    :cond_1
    iget p5, p5, Lr1/x0;->a:I

    :goto_2
    invoke-static {p4, p5}, Ljava/lang/Math;->max(II)I

    move-result p4

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    iput p4, p0, Lb0/g;->k:I

    iget-object p1, p0, Lb0/g;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lb0/g;->l:[I

    const/high16 p1, -0x80000000

    iput p1, p0, Lb0/g;->n:I

    return-void
.end method


# virtual methods
.method public final a(III)V
    .locals 10

    iput p1, p0, Lb0/g;->m:I

    iget-boolean v0, p0, Lb0/g;->j:Z

    if-eqz v0, :cond_0

    move v1, p3

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    iput v1, p0, Lb0/g;->n:I

    iget-object v1, p0, Lb0/g;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/x0;

    mul-int/lit8 v5, v3, 0x2

    iget-object v6, p0, Lb0/g;->l:[I

    if-eqz v0, :cond_2

    iget-object v7, p0, Lb0/g;->f:Ly0/b;

    if-eqz v7, :cond_1

    iget v8, v4, Lr1/x0;->a:I

    iget-object v9, p0, Lb0/g;->h:Lm2/l;

    check-cast v7, Ly0/e;

    invoke-virtual {v7, v8, p2, v9}, Ly0/e;->a(IILm2/l;)I

    move-result v7

    aput v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    aput p1, v6, v5

    iget v4, v4, Lr1/x0;->b:I

    :goto_2
    add-int/2addr p1, v4

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null horizontalAlignment"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    aput p1, v6, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v7, p0, Lb0/g;->g:Ly0/c;

    if-eqz v7, :cond_3

    iget v8, v4, Lr1/x0;->b:I

    check-cast v7, Ly0/f;

    invoke-virtual {v7, v8, p3}, Ly0/f;->a(II)I

    move-result v7

    aput v7, v6, v5

    iget v4, v4, Lr1/x0;->a:I

    goto :goto_2

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null verticalAlignment"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method
