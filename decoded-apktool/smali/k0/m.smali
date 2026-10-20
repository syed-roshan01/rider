.class public final Lk0/m;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 2

    iput p2, p0, Lk0/m;->a:I

    iput-object p1, p0, Lk0/m;->b:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Li5/ۢۤۡ;->ۣ۟۟ۦۦ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "yzdLqOhc4n3oyQS2I4MQV"

    invoke-static {v0}, Li/ۢۥۣ۟;->ۣۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a(Ly1/v;)V
    .locals 4

    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۤۤۧۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۢ۠ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Lc0/ۦۢۦۥ;->ۤۥ۟ۡ()Ly1/u;

    move-result-object v0

    check-cast p1, Ly1/j;

    invoke-static {p1, v0, v1}, Lz8/ۣۤۡۧ;->۟ۤۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۡۦۣۧ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "0dleQ"

    invoke-static {v0}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۥۨ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۢۥۦ()Ly1/u;

    move-result-object v2

    invoke-static {v1}, Li6/ۡۤۦ;->۟ۡۤۥۣ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v0, p1

    check-cast v0, Ly1/j;

    invoke-static {v0, v2, v1}, Lz8/ۣۤۡۧ;->۟ۤۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۣۣۧۥ:I

    xor-int/lit16 v0, v0, 0x189

    invoke-static {p1, v0}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->۟ۨ۠ۨ(Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_1
    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Lc1/ۣۡۢۦ;->ۤۦۢۨ()Ly1/u;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    move-result-object v2

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-static {v0, p1, v1}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟۠ۦ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۤۤۧۤ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Ls6/۟ۡ۟ۧۢ;->۟۟۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Ls6/۟ۡ۟ۧۢ;->۟۟۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Ls6/۟ۡ۟ۧۢ;->۟۟۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
