.class public final Lr6/g0;
.super Lr6/t;


# static fields
.field public static final p:[Ljava/lang/Object;

.field public static final q:Lr6/g0;


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:[Ljava/lang/Object;

.field public final transient n:I

.field public final transient o:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    new-instance v0, Lr6/g0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v5, v6

    invoke-direct/range {v1 .. v6}, Lr6/g0;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    sput-object v0, Lr6/g0;->q:Lr6/g0;

    return-void
.end method

.method public constructor <init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p4, p0, Lr6/g0;->d:[Ljava/lang/Object;

    iput p1, p0, Lr6/g0;->e:I

    iput-object p5, p0, Lr6/g0;->f:[Ljava/lang/Object;

    iput p2, p0, Lr6/g0;->n:I

    iput p3, p0, Lr6/g0;->o:I

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lr6/g0;->f:[Ljava/lang/Object;

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lz6/a;->i0(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lr6/g0;->n:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-nez v3, :cond_1

    return v0

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public final e([Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lr6/g0;->d:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lr6/g0;->o:I

    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v2
.end method

.method public final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/g0;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lr6/g0;->e:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lr6/g0;->o:I

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lr6/t;->b:Lr6/p;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr6/g0;->r()Lr6/p;

    move-result-object v0

    iput-object v0, p0, Lr6/t;->b:Lr6/p;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final r()Lr6/p;
    .locals 2

    iget-object v0, p0, Lr6/g0;->d:[Ljava/lang/Object;

    iget v1, p0, Lr6/g0;->o:I

    invoke-static {v1, v0}, Lr6/p;->o(I[Ljava/lang/Object;)Lr6/a0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lr6/g0;->o:I

    return v0
.end method
