.class public final Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lp9/g;"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:Lp9/g;


# direct methods
.method public constructor <init>(Lp9/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2;->$this_unsafeFlow:Lp9/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;

    iget v1, v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;

    invoke-direct {v0, p0, p2}, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;-><init>(Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;->result:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v0, v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;->label:I

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    if-ne v0, p1, :cond_1

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    check-cast p1, Lcom/google/firebase/firestore/DocumentSnapshot;

    invoke-static {}, Ld7/a;->C()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final emit$$forInline(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;

    invoke-direct {v0, p0, p2}, Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2$1;-><init>(Lcom/google/firebase/firestore/FirestoreKt$dataObjects$$inlined$map$2$2;Lu8/e;)V

    check-cast p1, Lcom/google/firebase/firestore/DocumentSnapshot;

    invoke-static {}, Ld7/a;->C()V

    const/4 p1, 0x0

    throw p1
.end method
