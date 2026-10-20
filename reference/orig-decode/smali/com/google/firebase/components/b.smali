.class public final synthetic Lcom/google/firebase/components/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/components/b;->a:I

    iput-object p1, p0, Lcom/google/firebase/components/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/components/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/components/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/FirebaseApp;

    invoke-static {v1}, Lcom/google/firebase/installations/FirebaseInstallations;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/installations/local/IidStore;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/components/ComponentDiscovery;->a(Ljava/lang/String;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
