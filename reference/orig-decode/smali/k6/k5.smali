.class public final Lk6/k5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lk6/h5;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk6/h5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p5, p0, Lk6/k5;->a:I

    iput-object p1, p0, Lk6/k5;->e:Lk6/h5;

    iput-object p2, p0, Lk6/k5;->b:Ljava/lang/String;

    iput-object p3, p0, Lk6/k5;->c:Ljava/lang/String;

    iput-object p4, p0, Lk6/k5;->d:Ljava/lang/String;

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

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
    const-string v0, "NjybOHA9lEdGxXtRCraqYrz3bYiyh"

    invoke-static {v0}, Ld/۟ۤ۠ۡۨ;->ۣ۟۟ۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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
.method public final call()Ljava/lang/Object;
    .locals 5

    invoke-static {p0}, Lh1/۟۟ۨۦۦ;->ۢۢۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lo2/۟ۤۨۡۥ;->۟ۡۦۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۧۢۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣۣۣۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Ldagger/hilt/internal/ۡۡۨۦ;->۟ۥۨۥۧ(Ljava/lang/Object;)Lk6/h5;

    move-result-object v4

    packed-switch v0, :pswitch_data_0

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->ۡۤۤۤ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->ۧۦۡۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    invoke-static {v0, v1, v3, v2}, Lcom/google/firebase/iid/ۥۣۣۡ;->۠ۧۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->ۡۤۤۤ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->ۧۦۡۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    invoke-static {v0, v1, v3, v2}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟۠ۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->ۡۤۤۤ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->ۧۦۡۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    invoke-static {v0, v1, v3, v2}, Lcom/google/firebase/iid/ۥۣۣۡ;->۠ۧۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->ۡۤۤۤ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->ۧۦۡۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    invoke-static {v0, v1, v3, v2}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟۠ۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
