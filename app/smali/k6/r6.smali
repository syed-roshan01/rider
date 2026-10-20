.class public final Lk6/r6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Lk6/p6;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk6/p6;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lk6/r6;->a:I

    iput-object p1, p0, Lk6/r6;->b:Lk6/p6;

    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "BGdA9SFY"

    invoke-static {v0}, Ld/۟ۤ۠ۡۨ;->ۣ۟۟ۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {p0}, Lw5/ۢۤۢ۠;->ۢۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۨۥۦ۟(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    iput-object v0, v1, Lk6/p6;->j:Lk6/q6;

    :goto_0
    return-void

    :pswitch_0
    invoke-static {v1}, Lz3/۟ۡ۠ۦۣ;->۟ۦۣۧۤ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    iput-object v0, v1, Lk6/p6;->e:Lk6/q6;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
