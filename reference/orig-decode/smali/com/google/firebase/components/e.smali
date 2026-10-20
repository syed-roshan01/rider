.class public final synthetic Lcom/google/firebase/components/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/components/ComponentRegistrar;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/components/e;->a:I

    iput-object p1, p0, Lcom/google/firebase/components/e;->b:Lcom/google/firebase/components/ComponentRegistrar;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/components/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/components/e;->b:Lcom/google/firebase/components/ComponentRegistrar;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/components/ComponentRuntime$Builder;->a(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/components/ComponentRuntime;->b(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
