.class public abstract Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/model/mutation/TransformOperation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation$Remove;,
        Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation$Union;
    }
.end annotation


# instance fields
.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/i2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo7/i2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->elements:Ljava/util/List;

    return-void
.end method

.method public static coercedFieldValuesArray(Lo7/i2;)Lo7/d;
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/Values;->isArray(Lo7/i2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo7/i2;->q()Lo7/e;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/l0;->toBuilder()Lcom/google/protobuf/g0;

    move-result-object p0

    check-cast p0, Lo7/d;

    return-object p0

    :cond_0
    invoke-static {}, Lo7/e;->l()Lo7/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract apply(Lo7/i2;)Lo7/i2;
.end method

.method public applyToLocalView(Lo7/i2;Lcom/google/firebase/Timestamp;)Lo7/i2;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->apply(Lo7/i2;)Lo7/i2;

    move-result-object p1

    return-object p1
.end method

.method public applyToRemoteDocument(Lo7/i2;Lo7/i2;)Lo7/i2;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->apply(Lo7/i2;)Lo7/i2;

    move-result-object p1

    return-object p1
.end method

.method public computeBaseValue(Lo7/i2;)Lo7/i2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;

    iget-object v0, p0, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->elements:Ljava/util/List;

    iget-object p1, p1, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->elements:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo7/i2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->elements:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->elements:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
