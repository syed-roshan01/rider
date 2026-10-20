.class public final Lja/x;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final b:Ljava/lang/String;


# instance fields
.field public final a:Lja/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    const-string v1, "separator"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lja/x;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lja/j;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/x;->a:Lja/j;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lka/c;->a(Lja/x;)I

    move-result v1

    const/4 v2, -0x1

    const/16 v3, 0x5c

    iget-object v4, p0, Lja/x;->a:Lja/j;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lja/j;->d()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v4, v1}, Lja/j;->i(I)B

    move-result v2

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    :goto_0
    invoke-virtual {v4}, Lja/j;->d()I

    move-result v2

    move v5, v1

    :goto_1
    if-ge v1, v2, :cond_4

    invoke-virtual {v4, v1}, Lja/j;->i(I)B

    move-result v6

    const/16 v7, 0x2f

    if-eq v6, v7, :cond_2

    invoke-virtual {v4, v1}, Lja/j;->i(I)B

    move-result v6

    if-ne v6, v3, :cond_3

    :cond_2
    invoke-virtual {v4, v5, v1}, Lja/j;->p(II)Lja/j;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v1, 0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Lja/j;->d()I

    move-result v1

    if-ge v5, v1, :cond_5

    invoke-virtual {v4}, Lja/j;->d()I

    move-result v1

    invoke-virtual {v4, v5, v1}, Lja/j;->p(II)Lja/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method public final b()Lja/x;
    .locals 11

    sget-object v0, Lka/c;->d:Lja/j;

    iget-object v1, p0, Lja/x;->a:Lja/j;

    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_b

    sget-object v2, Lka/c;->a:Lja/j;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    sget-object v4, Lka/c;->b:Lja/j;

    invoke-static {v1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    sget-object v5, Lka/c;->e:Lja/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "suffix"

    invoke-static {v5, v6}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v6

    iget-object v7, v5, Lja/j;->a:[B

    array-length v8, v7

    sub-int/2addr v6, v8

    array-length v7, v7

    invoke-virtual {v1, v6, v5, v7}, Lja/j;->m(ILja/j;I)Z

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v5

    if-ne v5, v7, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v1}, Lja/j;->d()I

    move-result v5

    sub-int/2addr v5, v6

    invoke-virtual {v1, v5, v2, v8}, Lja/j;->m(ILja/j;I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v1}, Lja/j;->d()I

    move-result v5

    sub-int/2addr v5, v6

    invoke-virtual {v1, v5, v4, v8}, Lja/j;->m(ILja/j;I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-static {v1, v2}, Lja/j;->k(Lja/j;Lja/j;)I

    move-result v2

    const/4 v5, -0x1

    if-eq v2, v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v1, v4}, Lja/j;->k(Lja/j;Lja/j;)I

    move-result v2

    :goto_0
    const/4 v9, 0x0

    if-ne v2, v7, :cond_5

    invoke-virtual {p0}, Lja/x;->g()Ljava/lang/Character;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v0

    if-ne v0, v6, :cond_4

    goto :goto_1

    :cond_4
    new-instance v3, Lja/x;

    invoke-static {v1, v9, v6, v8}, Lja/j;->q(Lja/j;III)Lja/j;

    move-result-object v0

    invoke-direct {v3, v0}, Lja/x;-><init>(Lja/j;)V

    goto :goto_1

    :cond_5
    if-ne v2, v8, :cond_6

    invoke-virtual {v1, v4}, Lja/j;->o(Lja/j;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    if-ne v2, v5, :cond_8

    invoke-virtual {p0}, Lja/x;->g()Ljava/lang/Character;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v0

    if-ne v0, v7, :cond_7

    goto :goto_1

    :cond_7
    new-instance v3, Lja/x;

    invoke-static {v1, v9, v7, v8}, Lja/j;->q(Lja/j;III)Lja/j;

    move-result-object v0

    invoke-direct {v3, v0}, Lja/x;-><init>(Lja/j;)V

    goto :goto_1

    :cond_8
    if-ne v2, v5, :cond_9

    new-instance v3, Lja/x;

    invoke-direct {v3, v0}, Lja/x;-><init>(Lja/j;)V

    goto :goto_1

    :cond_9
    if-nez v2, :cond_a

    new-instance v3, Lja/x;

    invoke-static {v1, v9, v8, v8}, Lja/j;->q(Lja/j;III)Lja/j;

    move-result-object v0

    invoke-direct {v3, v0}, Lja/x;-><init>(Lja/j;)V

    goto :goto_1

    :cond_a
    new-instance v3, Lja/x;

    invoke-static {v1, v9, v2, v8}, Lja/j;->q(Lja/j;III)Lja/j;

    move-result-object v0

    invoke-direct {v3, v0}, Lja/x;-><init>(Lja/j;)V

    :cond_b
    :goto_1
    return-object v3
.end method

.method public final c(Lja/x;)Lja/x;
    .locals 11

    const-string v0, "other"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lka/c;->a(Lja/x;)I

    move-result v0

    iget-object v1, p0, Lja/x;->a:Lja/j;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    new-instance v5, Lja/x;

    invoke-virtual {v1, v3, v0}, Lja/j;->p(II)Lja/j;

    move-result-object v0

    invoke-direct {v5, v0}, Lja/x;-><init>(Lja/j;)V

    :goto_0
    invoke-static {p1}, Lka/c;->a(Lja/x;)I

    move-result v0

    iget-object v6, p1, Lja/x;->a:Lja/j;

    if-ne v0, v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Lja/x;

    invoke-virtual {v6, v3, v0}, Lja/j;->p(II)Lja/j;

    move-result-object v0

    invoke-direct {v2, v0}, Lja/x;-><init>(Lja/j;)V

    :goto_1
    invoke-static {v5, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v2, " and "

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lja/x;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lja/x;->a()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    move v8, v3

    :goto_2
    if-ge v8, v7, :cond_2

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    if-ne v8, v7, :cond_3

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v1

    invoke-virtual {v6}, Lja/j;->d()I

    move-result v6

    if-ne v1, v6, :cond_3

    const-string p1, "."

    invoke-static {p1, v3}, Lfa/l;->i(Ljava/lang/String;Z)Lja/x;

    move-result-object p1

    goto :goto_5

    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v5, v8, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    sget-object v6, Lka/c;->e:Lja/j;

    invoke-interface {v1, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v4, :cond_7

    new-instance v1, Lja/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lka/c;->c(Lja/x;)Lja/j;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {p0}, Lka/c;->c(Lja/x;)Lja/j;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p1, Lja/x;->b:Ljava/lang/String;

    invoke-static {p1}, Lka/c;->f(Ljava/lang/String;)Lja/j;

    move-result-object p1

    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v4, v8

    :goto_3
    if-ge v4, v2, :cond_5

    sget-object v5, Lka/c;->e:Lja/j;

    invoke-virtual {v1, v5}, Lja/g;->e0(Lja/j;)V

    invoke-virtual {v1, p1}, Lja/g;->e0(Lja/j;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_4
    if-ge v8, v2, :cond_6

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja/j;

    invoke-virtual {v1, v4}, Lja/g;->e0(Lja/j;)V

    invoke-virtual {v1, p1}, Lja/g;->e0(Lja/j;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_6
    invoke-static {v1, v3}, Lka/c;->d(Lja/g;Z)Lja/x;

    move-result-object p1

    :goto_5
    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Impossible relative path to resolve: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Paths of different roots cannot be relative to each other: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lja/x;

    const-string v0, "other"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja/x;->a:Lja/j;

    iget-object p1, p1, Lja/x;->a:Lja/j;

    invoke-virtual {v0, p1}, Lja/j;->b(Lja/j;)I

    move-result p1

    return p1
.end method

.method public final d(Ljava/lang/String;)Lja/x;
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Lja/g;->n0(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lka/c;->d(Lja/g;Z)Lja/x;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lka/c;->b(Lja/x;Lja/x;Z)Lja/x;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v1}, Lja/j;->t()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lja/x;

    if-eqz v0, :cond_0

    check-cast p1, Lja/x;

    iget-object p1, p1, Lja/x;->a:Lja/j;

    iget-object v0, p0, Lja/x;->a:Lja/j;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Ljava/nio/file/Path;
    .locals 2

    iget-object v0, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->t()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g()Ljava/lang/Character;
    .locals 4

    sget-object v0, Lka/c;->a:Lja/j;

    iget-object v1, p0, Lja/x;->a:Lja/j;

    invoke-static {v1, v0}, Lja/j;->g(Lja/j;Lja/j;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lja/j;->d()I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lja/j;->i(I)B

    move-result v0

    const/16 v2, 0x3a

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lja/j;->i(I)B

    move-result v0

    int-to-char v0, v0

    const/16 v1, 0x61

    if-gt v1, v0, :cond_3

    const/16 v1, 0x7b

    if-ge v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0x41

    if-gt v1, v0, :cond_4

    const/16 v1, 0x5b

    if-ge v0, v1, :cond_4

    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    :cond_4
    :goto_1
    return-object v3
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lja/x;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
