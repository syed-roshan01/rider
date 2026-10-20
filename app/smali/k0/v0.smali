.class public final Lk0/v0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Ly0/o;

.field public final c:F

.field public final d:J

.field public final e:I

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;FJIII)V
    .locals 3

    iput p7, p0, Lk0/v0;->a:I

    iput-object p1, p0, Lk0/v0;->b:Ly0/o;

    iput p2, p0, Lk0/v0;->c:F

    iput-wide p3, p0, Lk0/v0;->d:J

    iput p5, p0, Lk0/v0;->e:I

    iput p6, p0, Lk0/v0;->f:I

    sget v0, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۡۡۨۧ:I

    xor-int/lit8 v0, v0, 0x28

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lb7/۟۟ۤۤۤ;->۟ۦۣۣۦ()I

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
    const-string v0, "NYI4BfyfuELIL2D5k"

    invoke-static {v0}, Lr6/ۥۡۥۥ;->ۡ۟ۥۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
.method public final a(Lm0/m;I)V
    .locals 7

    invoke-static {p0}, Lt1/ۧۦۤۧ;->ۧۨۤۥ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lv5/ۧۥۢۡ;->ۡ۠ۢ۠(Ljava/lang/Object;)I

    move-result v4

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۣ۠۟ۡ(Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->۟ۦ۠۟ۢ(Ljava/lang/Object;)F

    move-result v1

    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟ۧۡۦۡ(Ljava/lang/Object;)J

    move-result-wide v2

    xor-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v5

    invoke-static {v4}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->ۡۥۤۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lc4/ۡ۟۠ۥ;->ۣ۟ۡۨۦ(Ljava/lang/Object;FJLjava/lang/Object;II)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۣ۠۟ۡ(Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->۟ۦ۠۟ۢ(Ljava/lang/Object;)F

    move-result v1

    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟ۧۡۦۡ(Ljava/lang/Object;)J

    move-result-wide v2

    xor-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v5

    invoke-static {v4}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->ۡۥۤۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lb7/ۣ۟۟ۦ۟;->ۧ۟ۢۥ(Ljava/lang/Object;FJLjava/lang/Object;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lt1/ۧۦۤۧ;->ۧۨۤۥ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۦۨۡ(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۦۨۡ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
