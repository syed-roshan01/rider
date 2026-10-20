.class public final Lf0/f1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:I

.field public final b:Lf0/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lf0/k1;I)V
    .locals 2

    iput p2, p0, Lf0/f1;->a:I

    iput-object p1, p0, Lf0/f1;->b:Lf0/k1;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lk2/۟ۢۦۤۤ;->۟ۦۣۤ۟()I

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
    const-string v0, "pqmYwrRyreUzm1cMxmKmTBZv1Zjhp"

    invoke-static {v0}, Lb7/۟۟ۤۤۤ;->ۤ۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Ls8/ۣۡۡ۠;->ۥۧۥۨ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۦۦۧۡ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v2

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lo1/u;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lw2/۟ۧۥۦۨ;->ۣ۟ۥۧۡ(Ljava/lang/Object;Z)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Lw4/ۥۤ۟۠;->ۣ۟ۡ۠ۥ(Ljava/lang/Object;J)V

    invoke-static {p1}, Ldagger/hilt/components/ۡۧ۟;->ۥۧۥۤ(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ld1/c;

    invoke-static {p1}, Laa/۟ۦۣۢۨ;->۠۟ۢۤ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۤۥۣۧ(Ljava/lang/Object;J)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
