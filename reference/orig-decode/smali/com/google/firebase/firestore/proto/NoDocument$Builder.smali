.class public final Lcom/google/firebase/firestore/proto/NoDocument$Builder;
.super Lcom/google/protobuf/g0;

# interfaces
.implements Lcom/google/firebase/firestore/proto/NoDocumentOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/proto/NoDocument;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/g0;",
        "Lcom/google/firebase/firestore/proto/NoDocumentOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/firebase/firestore/proto/NoDocument;->access$000()Lcom/google/firebase/firestore/proto/NoDocument;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/firestore/proto/NoDocument$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/NoDocument$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearName()Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->access$200(Lcom/google/firebase/firestore/proto/NoDocument;)V

    return-object p0
.end method

.method public clearReadTime()Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->access$600(Lcom/google/firebase/firestore/proto/NoDocument;)V

    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/n;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->getNameBytes()Lcom/google/protobuf/n;

    move-result-object v0

    return-object v0
.end method

.method public getReadTime()Lcom/google/protobuf/q2;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->getReadTime()Lcom/google/protobuf/q2;

    move-result-object v0

    return-object v0
.end method

.method public hasReadTime()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->hasReadTime()Z

    move-result v0

    return v0
.end method

.method public mergeReadTime(Lcom/google/protobuf/q2;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/proto/NoDocument;->access$500(Lcom/google/firebase/firestore/proto/NoDocument;Lcom/google/protobuf/q2;)V

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/proto/NoDocument;->access$100(Lcom/google/firebase/firestore/proto/NoDocument;Ljava/lang/String;)V

    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/n;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/proto/NoDocument;->access$300(Lcom/google/firebase/firestore/proto/NoDocument;Lcom/google/protobuf/n;)V

    return-object p0
.end method

.method public setReadTime(Lcom/google/protobuf/p2;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 4
    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/q2;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/proto/NoDocument;->access$400(Lcom/google/firebase/firestore/proto/NoDocument;Lcom/google/protobuf/q2;)V

    return-object p0
.end method

.method public setReadTime(Lcom/google/protobuf/q2;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g0;->copyOnWrite()V

    iget-object v0, p0, Lcom/google/protobuf/g0;->instance:Lcom/google/protobuf/l0;

    .line 2
    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/proto/NoDocument;->access$400(Lcom/google/firebase/firestore/proto/NoDocument;Lcom/google/protobuf/q2;)V

    return-object p0
.end method
