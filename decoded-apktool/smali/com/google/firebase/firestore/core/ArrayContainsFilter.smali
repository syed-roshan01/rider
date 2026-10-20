.class public Lcom/google/firebase/firestore/core/ArrayContainsFilter;
.super Lcom/google/firebase/firestore/core/FieldFilter;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/model/FieldPath;Lo7/i2;)V
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/core/FieldFilter$Operator;->ARRAY_CONTAINS:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/firebase/firestore/core/FieldFilter;-><init>(Lcom/google/firebase/firestore/model/FieldPath;Lcom/google/firebase/firestore/core/FieldFilter$Operator;Lo7/i2;)V

    return-void
.end method


# virtual methods
.method public matches(Lcom/google/firebase/firestore/model/Document;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/core/FieldFilter;->getField()Lcom/google/firebase/firestore/model/FieldPath;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/firebase/firestore/model/Document;->getField(Lcom/google/firebase/firestore/model/FieldPath;)Lo7/i2;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/model/Values;->isArray(Lo7/i2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo7/i2;->q()Lo7/e;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/core/FieldFilter;->getValue()Lo7/i2;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/firebase/firestore/model/Values;->contains(Lo7/f;Lo7/i2;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
