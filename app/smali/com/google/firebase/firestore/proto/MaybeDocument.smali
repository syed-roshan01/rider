.class public final Lcom/google/firebase/firestore/proto/MaybeDocument;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/firebase/firestore/proto/MaybeDocumentOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;,
        Lcom/google/firebase/firestore/proto/MaybeDocument$DocumentTypeCase;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/l0;",
        "Lcom/google/firebase/firestore/proto/MaybeDocumentOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

.field public static final DOCUMENT_FIELD_NUMBER:I = 0x2

.field public static final HAS_COMMITTED_MUTATIONS_FIELD_NUMBER:I = 0x4

.field public static final NO_DOCUMENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final UNKNOWN_DOCUMENT_FIELD_NUMBER:I = 0x3


# instance fields
.field private documentTypeCase_:I

.field private documentType_:Ljava/lang/Object;

.field private hasCommittedMutations_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-direct {v0}, Lcom/google/firebase/firestore/proto/MaybeDocument;-><init>()V

    sput-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    const-class v1, Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method public static synthetic access$000()Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object v0
.end method

.method public static synthetic access$100(Lcom/google/firebase/firestore/proto/MaybeDocument;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/MaybeDocument;->clearDocumentType()V

    return-void
.end method

.method public static synthetic access$1000(Lcom/google/firebase/firestore/proto/MaybeDocument;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/MaybeDocument;->clearUnknownDocument()V

    return-void
.end method

.method public static synthetic access$1100(Lcom/google/firebase/firestore/proto/MaybeDocument;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->setHasCommittedMutations(Z)V

    return-void
.end method

.method public static synthetic access$1200(Lcom/google/firebase/firestore/proto/MaybeDocument;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/MaybeDocument;->clearHasCommittedMutations()V

    return-void
.end method

.method public static synthetic access$200(Lcom/google/firebase/firestore/proto/MaybeDocument;Lcom/google/firebase/firestore/proto/NoDocument;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->setNoDocument(Lcom/google/firebase/firestore/proto/NoDocument;)V

    return-void
.end method

.method public static synthetic access$300(Lcom/google/firebase/firestore/proto/MaybeDocument;Lcom/google/firebase/firestore/proto/NoDocument;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->mergeNoDocument(Lcom/google/firebase/firestore/proto/NoDocument;)V

    return-void
.end method

.method public static synthetic access$400(Lcom/google/firebase/firestore/proto/MaybeDocument;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/MaybeDocument;->clearNoDocument()V

    return-void
.end method

.method public static synthetic access$500(Lcom/google/firebase/firestore/proto/MaybeDocument;Lo7/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->setDocument(Lo7/s;)V

    return-void
.end method

.method public static synthetic access$600(Lcom/google/firebase/firestore/proto/MaybeDocument;Lo7/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->mergeDocument(Lo7/s;)V

    return-void
.end method

.method public static synthetic access$700(Lcom/google/firebase/firestore/proto/MaybeDocument;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/proto/MaybeDocument;->clearDocument()V

    return-void
.end method

.method public static synthetic access$800(Lcom/google/firebase/firestore/proto/MaybeDocument;Lcom/google/firebase/firestore/proto/UnknownDocument;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->setUnknownDocument(Lcom/google/firebase/firestore/proto/UnknownDocument;)V

    return-void
.end method

.method public static synthetic access$900(Lcom/google/firebase/firestore/proto/MaybeDocument;Lcom/google/firebase/firestore/proto/UnknownDocument;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;->mergeUnknownDocument(Lcom/google/firebase/firestore/proto/UnknownDocument;)V

    return-void
.end method

.method private clearDocument()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private clearDocumentType()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    return-void
.end method

.method private clearHasCommittedMutations()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->hasCommittedMutations_:Z

    return-void
.end method

.method private clearNoDocument()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private clearUnknownDocument()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static getDefaultInstance()Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object v0
.end method

.method private mergeDocument(Lo7/s;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    invoke-static {}, Lo7/s;->i()Lo7/s;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lo7/s;

    invoke-static {v0}, Lo7/s;->m(Lo7/s;)Lo7/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p1

    check-cast p1, Lo7/q;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :goto_0
    iput v1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method private mergeNoDocument(Lcom/google/firebase/firestore/proto/NoDocument;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    invoke-static {}, Lcom/google/firebase/firestore/proto/NoDocument;->getDefaultInstance()Lcom/google/firebase/firestore/proto/NoDocument;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    invoke-static {v0}, Lcom/google/firebase/firestore/proto/NoDocument;->newBuilder(Lcom/google/firebase/firestore/proto/NoDocument;)Lcom/google/firebase/firestore/proto/NoDocument$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/proto/NoDocument$Builder;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :goto_0
    iput v1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method private mergeUnknownDocument(Lcom/google/firebase/firestore/proto/UnknownDocument;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    invoke-static {}, Lcom/google/firebase/firestore/proto/UnknownDocument;->getDefaultInstance()Lcom/google/firebase/firestore/proto/UnknownDocument;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/proto/UnknownDocument;

    invoke-static {v0}, Lcom/google/firebase/firestore/proto/UnknownDocument;->newBuilder(Lcom/google/firebase/firestore/proto/UnknownDocument;)Lcom/google/firebase/firestore/proto/UnknownDocument$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->mergeFrom(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/proto/UnknownDocument$Builder;

    invoke-virtual {p1}, Lcom/google/protobuf/g0;->buildPartial()Lcom/google/protobuf/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    :goto_0
    iput v1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method public static newBuilder()Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 1
    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/google/firebase/firestore/proto/MaybeDocument;)Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 2
    invoke-virtual {v0, p0}, Lcom/google/protobuf/l0;->createBuilder(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 1
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseDelimitedFrom(Lcom/google/protobuf/l0;Ljava/io/InputStream;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 2
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseDelimitedFrom(Lcom/google/protobuf/l0;Ljava/io/InputStream;Lcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/n;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Lcom/google/protobuf/n;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/n;Lcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Lcom/google/protobuf/n;Lcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/s;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 9
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Lcom/google/protobuf/s;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Lcom/google/protobuf/s;Lcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 7
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Ljava/io/InputStream;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Ljava/io/InputStream;Lcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 1
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 2
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;Ljava/nio/ByteBuffer;Lcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 5
    invoke-static {v0, p0}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;[B)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/z;)Lcom/google/firebase/firestore/proto/MaybeDocument;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    .line 6
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/l0;->parseFrom(Lcom/google/protobuf/l0;[BLcom/google/protobuf/z;)Lcom/google/protobuf/l0;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/b2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/b2;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->getParserForType()Lcom/google/protobuf/b2;

    move-result-object v0

    return-object v0
.end method

.method private setDocument(Lo7/s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method private setHasCommittedMutations(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->hasCommittedMutations_:Z

    return-void
.end method

.method private setNoDocument(Lcom/google/firebase/firestore/proto/NoDocument;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method

.method private setUnknownDocument(Lcom/google/firebase/firestore/proto/UnknownDocument;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/google/firebase/firestore/proto/MaybeDocument;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/firebase/firestore/proto/MaybeDocument;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/firebase/firestore/proto/MaybeDocument;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lcom/google/firebase/firestore/proto/MaybeDocument;->PARSER:Lcom/google/protobuf/b2;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_1
    sget-object p1, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;

    invoke-direct {p1, p2}, Lcom/google/firebase/firestore/proto/MaybeDocument$Builder;-><init>(Lcom/google/firebase/firestore/proto/MaybeDocument$1;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-direct {p1}, Lcom/google/firebase/firestore/proto/MaybeDocument;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "documentType_"

    const-string v1, "documentTypeCase_"

    const-class v2, Lcom/google/firebase/firestore/proto/NoDocument;

    const-class v3, Lo7/s;

    const-class v4, Lcom/google/firebase/firestore/proto/UnknownDocument;

    const-string v5, "hasCommittedMutations_"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007"

    sget-object p3, Lcom/google/firebase/firestore/proto/MaybeDocument;->DEFAULT_INSTANCE:Lcom/google/firebase/firestore/proto/MaybeDocument;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/l0;->newMessageInfo(Lcom/google/protobuf/t1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    return-object p2

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getDocument()Lo7/s;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lo7/s;

    return-object v0

    :cond_0
    invoke-static {}, Lo7/s;->i()Lo7/s;

    move-result-object v0

    return-object v0
.end method

.method public getDocumentTypeCase()Lcom/google/firebase/firestore/proto/MaybeDocument$DocumentTypeCase;
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    invoke-static {v0}, Lcom/google/firebase/firestore/proto/MaybeDocument$DocumentTypeCase;->forNumber(I)Lcom/google/firebase/firestore/proto/MaybeDocument$DocumentTypeCase;

    move-result-object v0

    return-object v0
.end method

.method public getHasCommittedMutations()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->hasCommittedMutations_:Z

    return v0
.end method

.method public getNoDocument()Lcom/google/firebase/firestore/proto/NoDocument;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/proto/NoDocument;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/firebase/firestore/proto/NoDocument;->getDefaultInstance()Lcom/google/firebase/firestore/proto/NoDocument;

    move-result-object v0

    return-object v0
.end method

.method public getUnknownDocument()Lcom/google/firebase/firestore/proto/UnknownDocument;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/proto/UnknownDocument;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/firebase/firestore/proto/UnknownDocument;->getDefaultInstance()Lcom/google/firebase/firestore/proto/UnknownDocument;

    move-result-object v0

    return-object v0
.end method

.method public hasDocument()Z
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasNoDocument()Z
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public hasUnknownDocument()Z
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/proto/MaybeDocument;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
