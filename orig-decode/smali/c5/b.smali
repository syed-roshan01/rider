.class public final Lc5/b;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lc5/b;

.field public static final c:Lc5/b;

.field public static final d:Lc5/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lc5/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc5/b;-><init>(I)V

    sput-object v0, Lc5/b;->b:Lc5/b;

    new-instance v0, Lc5/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc5/b;-><init>(I)V

    sput-object v0, Lc5/b;->c:Lc5/b;

    new-instance v0, Lc5/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lc5/b;-><init>(I)V

    sput-object v0, Lc5/b;->d:Lc5/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc5/b;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 25

    move-object/from16 v7, p0

    iget v0, v7, Lc5/b;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    and-int/lit8 v0, p2, 0xb

    if-ne v0, v1, :cond_1

    move-object/from16 v0, p1

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v21, Lf2/l;->f:Lf2/l;

    sget-wide v2, Le5/a;->n:J

    const-string v0, "\u26a0\ufe0f Blocked App Detected"

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30186

    const/16 v23, 0x0

    const v24, 0x1ffda

    move-object/from16 v7, v21

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_1
    return-void

    :pswitch_0
    and-int/lit8 v0, p2, 0xb

    if-ne v0, v1, :cond_3

    move-object/from16 v0, p1

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    const-string v0, "Your account has been disabled or deleted by the administrator. Please contact support for assistance."

    const/4 v1, 0x0

    sget-wide v2, Le5/a;->l:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x186

    const/16 v23, 0x0

    const v24, 0x1fffa

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_3
    return-void

    :pswitch_1
    and-int/lit8 v0, p2, 0xb

    if-ne v0, v1, :cond_5

    move-object/from16 v0, p1

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_5

    :cond_5
    :goto_4
    sget-object v7, Lf2/l;->f:Lf2/l;

    sget-wide v2, Le5/a;->n:J

    const-string v0, "Account Disabled"

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30186

    const/16 v23, 0x0

    const v24, 0x1ffda

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/b;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/b;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/b;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/b;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
