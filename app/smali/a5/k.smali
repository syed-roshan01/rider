.class public final La5/k;
.super Lw8/c;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:Ljava/lang/Object;

.field public final n:La5/z;

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La5/z;Lu8/e;)V
    .locals 2

    iput-object p1, p0, La5/k;->n:La5/z;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    invoke-static {}, Le2/۟۟ۥۦ;->ۥۦۡۥ()I

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
    const-string v0, "9ryELDjDkOOrYi1wtowIO"

    invoke-static {v0}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->۟۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/high16 v3, -0x80000000

    const/4 v2, 0x0

    iput-object p1, p0, La5/k;->f:Ljava/lang/Object;

    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۧۡۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v1, v0, v3

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    iput v0, p0, La5/k;->o:I

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->۟ۦۡۢۧ(Ljava/lang/Object;)La5/z;

    move-result-object v1

    const-wide/16 v4, 0x204

    sget v0, Ldagger/hilt/components/ۡۧ۟;->ۣۨۢۤ:I

    int-to-long v6, v0

    xor-long/2addr v4, v6

    move-object v3, v2

    move-object v6, v2

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Ld5/ۣۦۢۢ;->ۧۦۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne v0, v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v1, Lq8/h;

    invoke-direct {v1, v0}, Lq8/h;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :sswitch_3
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method
