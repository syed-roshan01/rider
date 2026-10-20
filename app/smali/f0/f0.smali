.class public final Lf0/f0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZII)V
    .locals 3

    iput p4, p0, Lf0/f0;->a:I

    iput-object p1, p0, Lf0/f0;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Lf0/f0;->b:Z

    iput p3, p0, Lf0/f0;->c:I

    sget v0, Lh3/ۣ۠ۡۨ;->ۣ۟ۡۥۨ:I

    xor-int/lit16 v0, v0, -0x260

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۢۡۤۡ()I

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
    const-string v0, "SJpIBSjRpRZjXsTfxP8zcDji166EA"

    invoke-static {v0}, Lr7/۟۟ۡ۟ۢ;->ۧۥۣۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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
    .locals 4

    invoke-static {p0}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۥۢ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۥۨۢۧ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۢۥۤۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lu/ۣۤۧ۠;->۟ۢۡ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    xor-int/lit8 v1, v3, 0x1

    and-int/lit8 v3, v3, 0x1

    or-int/2addr v1, v3

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v0, v2, p1, v1}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟۠ۤۧ(Ljava/lang/Object;ZLjava/lang/Object;I)V

    :goto_0
    return-void

    :pswitch_0
    check-cast v0, Lh0/v0;

    xor-int/lit8 v1, v3, 0x1

    and-int/lit8 v3, v3, 0x1

    or-int/2addr v1, v3

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v0, v2, p1, v1}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۟ۡۤۨ(Ljava/lang/Object;ZLjava/lang/Object;I)V

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

    invoke-static {p0}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۥۢ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Ls3/۟ۧ۟ۡۢ;->ۣ۟۠ۨ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Ls3/۟ۧ۟ۡۢ;->ۣ۟۠ۨ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
