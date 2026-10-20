.class public final Ld5/y0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Li1/f;

.field public final f:Lc9/a;

.field public final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLi1/f;Lc9/a;II)V
    .locals 3

    iput p7, p0, Ld5/y0;->a:I

    iput-object p1, p0, Ld5/y0;->b:Ljava/lang/String;

    iput-object p2, p0, Ld5/y0;->c:Ljava/lang/String;

    iput-boolean p3, p0, Ld5/y0;->d:Z

    iput-object p4, p0, Ld5/y0;->e:Li1/f;

    iput-object p5, p0, Ld5/y0;->f:Lc9/a;

    iput p6, p0, Ld5/y0;->n:I

    sget v0, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟ۢ۟ۡۨ:I

    xor-int/lit16 v0, v0, 0x122

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lo1/۟ۡۡۦۣ;->۟ۥۥۢ۟()I

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
    const-string v0, "uSx672NET3CROLQLQ1J95"

    invoke-static {v0}, Ldagger/hilt/internal/ۡۡۨۦ;->ۣ۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

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
.method public final a(Lm0/m;I)V
    .locals 7

    invoke-static {p0}, Ln1/۟۠۟ۤۤ;->ۣ۟ۢۢ۟(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۧۥۧ۟(Ljava/lang/Object;)I

    move-result v5

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۣ۠ۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->۟ۢۢ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧۤۨۡ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->ۣۣۢۨ(Ljava/lang/Object;)Li1/f;

    move-result-object v3

    invoke-static {p0}, Lt2/۟ۢ۟ۢ۟;->ۦۣۦۨ(Ljava/lang/Object;)Lc9/a;

    move-result-object v4

    xor-int/lit8 v6, v5, 0x1

    and-int/lit8 v5, v5, 0x1

    or-int/2addr v5, v6

    invoke-static {v5}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, Lk1/ۨ۟ۧۡ;->۟ۦۨۡۦ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۣ۠ۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->۟ۢۢ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧۤۨۡ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->ۣۣۢۨ(Ljava/lang/Object;)Li1/f;

    move-result-object v3

    invoke-static {p0}, Lt2/۟ۢ۟ۢ۟;->ۦۣۦۨ(Ljava/lang/Object;)Lc9/a;

    move-result-object v4

    xor-int/lit8 v6, v5, 0x1

    and-int/lit8 v5, v5, 0x1

    or-int/2addr v5, v6

    invoke-static {v5}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, Lv8/۟ۧۢ۟ۢ;->۟۠۟ۨ۟(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

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

    invoke-static {p0}, Ln1/۟۠۟ۤۤ;->ۣ۟ۢۢ۟(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lh3/ۣ۠ۡۨ;->ۥۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lh3/ۣ۠ۡۨ;->ۥۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
