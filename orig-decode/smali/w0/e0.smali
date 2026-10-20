.class public final Lw0/e0;
.super Lw0/f0;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lw0/x;Ljava/util/Iterator;I)V
    .locals 0

    iput p3, p0, Lw0/e0;->f:I

    invoke-direct {p0, p1, p2}, Lw0/f0;-><init>(Lw0/x;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lw0/e0;->f:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw0/f0;->e:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lw0/f0;->a()V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lw0/f0;->e:Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lw0/f0;->a()V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, Lw0/f0;->a()V

    iget-object v0, p0, Lw0/f0;->d:Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    new-instance v0, Lw0/d0;

    invoke-direct {v0, p0}, Lw0/d0;-><init>(Lw0/e0;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
