.class public Lcom/google/firebase/firestore/core/NotInFilter;
.super Lcom/google/firebase/firestore/core/FieldFilter;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/model/FieldPath;Lo7/i2;)V
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/core/FieldFilter$Operator;->NOT_IN:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/firebase/firestore/core/FieldFilter;-><init>(Lcom/google/firebase/firestore/model/FieldPath;Lcom/google/firebase/firestore/core/FieldFilter$Operator;Lo7/i2;)V

    invoke-static {p2}, Lcom/google/firebase/firestore/model/Values;->isArray(Lo7/i2;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "NotInFilter expects an ArrayValue"

    invoke-static {p1, v0, p2}, Lcom/google/firebase/firestore/util/Assert;->hardAssert(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public matches(Lcom/google/firebase/firestore/model/Document;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/firestore/core/FieldFilter;->getValue()Lo7/i2;

    move-result-object v0

    invoke-virtual {v0}, Lo7/i2;->q()Lo7/e;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/model/Values;->NULL_VALUE:Lo7/i2;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/model/Values;->contains(Lo7/f;Lo7/i2;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/firestore/core/FieldFilter;->getField()Lcom/google/firebase/firestore/model/FieldPath;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/firebase/firestore/model/Document;->getField(Lcom/google/firebase/firestore/model/FieldPath;)Lo7/i2;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/core/FieldFilter;->getValue()Lo7/i2;

    move-result-object v0

    invoke-virtual {v0}, Lo7/i2;->q()Lo7/e;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/model/Values;->contains(Lo7/f;Lo7/i2;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
