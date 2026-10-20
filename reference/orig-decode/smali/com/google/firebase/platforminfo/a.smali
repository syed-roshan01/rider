.class public final synthetic Lcom/google/firebase/platforminfo/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/components/ComponentFactory;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/platforminfo/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/platforminfo/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/platforminfo/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/firebase/platforminfo/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/platforminfo/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/platforminfo/a;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/components/Component;

    invoke-static {v1, v2, p1}, Lcom/google/firebase/tracing/ComponentMonitor;->a(Ljava/lang/String;Lcom/google/firebase/components/Component;Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v2, Lcom/google/firebase/platforminfo/LibraryVersionComponent$VersionExtractor;

    invoke-static {v1, v2, p1}, Lcom/google/firebase/platforminfo/LibraryVersionComponent;->a(Ljava/lang/String;Lcom/google/firebase/platforminfo/LibraryVersionComponent$VersionExtractor;Lcom/google/firebase/components/ComponentContainer;)Lcom/google/firebase/platforminfo/LibraryVersion;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
