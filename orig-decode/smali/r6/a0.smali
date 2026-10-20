.class public final Lr6/a0;
.super Lr6/p;


# static fields
.field public static final e:Lr6/a0;


# instance fields
.field public final transient c:[Ljava/lang/Object;

.field public final transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr6/a0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lr6/a0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lr6/a0;->e:Lr6/a0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lr6/a0;->c:[Ljava/lang/Object;

    iput p2, p0, Lr6/a0;->d:I

    return-void
.end method


# virtual methods
.method public final e([Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lr6/a0;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lr6/a0;->d:I

    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v2
.end method

.method public final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/a0;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr6/a0;->d:I

    invoke-static {p1, v0}, Ly3/e;->I(II)V

    iget-object v0, p0, Lr6/a0;->c:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lr6/a0;->d:I

    return v0
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

.method public final size()I
    .locals 1

    iget v0, p0, Lr6/a0;->d:I

    return v0
.end method
