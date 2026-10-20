.class public final synthetic Ly3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/io/Serializable;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Ly3/a;->a:I

    iput-object p1, p0, Ly3/a;->d:Ljava/lang/Object;

    iput p2, p0, Ly3/a;->b:I

    iput-object p3, p0, Ly3/a;->c:Ljava/lang/Object;

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

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
    const-string v0, "LLLVQpbBFl"

    invoke-static {v0}, Lx0/ۣ۠۟۠;->۟ۢۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
    .locals 4

    invoke-static {p0}, Lf0/ۣۤ۠۟;->ۣۢۢۡ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Ls7/۟ۢ۟ۤۧ;->ۧۤۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۟ۥۡ۠ۨ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lt1/ۧۦۤۧ;->۟ۤ۟۠ۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Ly3/d;

    invoke-static {v0, v3, v2}, Lf4/ۡۥۣۢ;->ۧۥ۠ۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_0
    :sswitch_0
    return-void

    :pswitch_0
    check-cast v0, Ly3/b;

    invoke-static {v0}, Lh8/۟ۨۧ;->۟ۦۤۥۣ(Ljava/lang/Object;)Ly3/d;

    move-result-object v0

    invoke-static {v0, v3, v2}, Lf4/ۡۥۣۢ;->ۧۥ۠ۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_2
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_3
    const-string v0, "tR1f4lRLW9Tgx3t38a"

    invoke-static {v0}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۣ۟۠۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch
.end method
