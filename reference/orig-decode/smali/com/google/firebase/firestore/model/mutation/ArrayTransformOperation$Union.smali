.class public Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation$Union;
.super Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Union"
.end annotation


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

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public apply(Lo7/i2;)Lo7/i2;
    .locals 3

    invoke-static {p1}, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->coercedFieldValuesArray(Lo7/i2;)Lo7/d;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/model/mutation/ArrayTransformOperation;->getElements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/i2;

    invoke-static {p1, v1}, Lcom/google/firebase/firestore/model/Values;->contains(Lo7/f;Lo7/i2;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Lo7/d;->d(Lo7/i2;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lo7/i2;->C()Lo7/g2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo7/g2;->d(Lo7/d;)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lo7/i2;

    return-object p1
.end method
