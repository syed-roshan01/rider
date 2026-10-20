.class Lcom/google/firebase/firestore/Filter$UnaryFilter;
.super Lcom/google/firebase/firestore/Filter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/Filter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnaryFilter"
.end annotation


# instance fields
.field private final field:Lcom/google/firebase/firestore/FieldPath;

.field private final operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

.field private final value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FieldPath;Lcom/google/firebase/firestore/core/FieldFilter$Operator;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/Filter;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->field:Lcom/google/firebase/firestore/FieldPath;

    iput-object p2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    iput-object p3, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->value:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/Filter$UnaryFilter;

    iget-object v2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    iget-object v3, p1, Lcom/google/firebase/firestore/Filter$UnaryFilter;->operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->field:Lcom/google/firebase/firestore/FieldPath;

    iget-object v3, p1, Lcom/google/firebase/firestore/Filter$UnaryFilter;->field:Lcom/google/firebase/firestore/FieldPath;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->value:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/firebase/firestore/Filter$UnaryFilter;->value:Ljava/lang/Object;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public getField()Lcom/google/firebase/firestore/FieldPath;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->field:Lcom/google/firebase/firestore/FieldPath;

    return-object v0
.end method

.method public getOperator()Lcom/google/firebase/firestore/core/FieldFilter$Operator;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->field:Lcom/google/firebase/firestore/FieldPath;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FieldPath;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->operator:Lcom/google/firebase/firestore/core/FieldFilter$Operator;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/firebase/firestore/Filter$UnaryFilter;->value:Ljava/lang/Object;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method
