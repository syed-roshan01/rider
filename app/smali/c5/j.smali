.class public final Lc5/j;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V
    .locals 0

    iput p2, p0, Lc5/j;->a:I

    iput-object p1, p0, Lc5/j;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/j;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 4
    :pswitch_2
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 5
    :pswitch_3
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 6
    :pswitch_4
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 7
    :pswitch_5
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 8
    :pswitch_6
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 9
    :pswitch_7
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 10
    :pswitch_8
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 11
    :pswitch_9
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 12
    :pswitch_a
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 13
    :pswitch_b
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 14
    :pswitch_c
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 15
    :pswitch_d
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 16
    :pswitch_e
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    .line 17
    :pswitch_f
    invoke-virtual {p0}, Lc5/j;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 7

    const/4 v0, 0x3

    sget-object v1, Lr8/r;->a:Lr8/r;

    const-string v2, "history_json"

    const/4 v3, 0x0

    iget v4, p0, Lc5/j;->a:I

    const/4 v5, 0x0

    iget-object v6, p0, Lc5/j;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    packed-switch v4, :pswitch_data_0

    .line 18
    invoke-virtual {v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->A:Lp9/q0;

    .line 20
    invoke-virtual {v0}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 21
    :pswitch_1
    invoke-virtual {v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    return-void

    .line 22
    :pswitch_2
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->A:Lp9/q0;

    .line 23
    invoke-virtual {v0}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 24
    :pswitch_3
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->b:Lz4/d;

    .line 25
    iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;

    .line 26
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "accepted_count"

    .line 27
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "skipped_count"

    .line 28
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "today_earnings"

    .line 29
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_detected_fare"

    .line 30
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    .line 32
    :pswitch_4
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->D0:Lz4/g;

    .line 33
    iget-object v0, v0, Lz4/g;->a:Landroid/content/SharedPreferences;

    .line 34
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 35
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->E0:Lp9/q0;

    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 36
    :pswitch_5
    invoke-virtual {v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    return-void

    .line 37
    :pswitch_6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-static {v6}, Lo1/s;->R(Landroidx/lifecycle/x0;)Lm9/d0;

    move-result-object v1

    new-instance v2, Lf5/x;

    invoke-direct {v2, v6, v5}, Lf5/x;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    invoke-static {v1, v5, v3, v2, v0}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void

    .line 39
    :pswitch_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {v6}, Lo1/s;->R(Landroidx/lifecycle/x0;)Lm9/d0;

    move-result-object v1

    new-instance v2, Lf5/v;

    invoke-direct {v2, v6, v5}, Lf5/v;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    invoke-static {v1, v5, v3, v2, v0}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void

    .line 41
    :pswitch_8
    invoke-virtual {v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    return-void

    .line 42
    :pswitch_9
    invoke-virtual {v6}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    return-void

    .line 43
    :pswitch_a
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->I0:Lp9/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 45
    :pswitch_b
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->I0:Lp9/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 47
    :pswitch_c
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->D0:Lz4/g;

    .line 48
    iget-object v0, v0, Lz4/g;->a:Landroid/content/SharedPreferences;

    .line 49
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 50
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->E0:Lp9/q0;

    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 51
    :pswitch_d
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->G0:Lp9/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 53
    :pswitch_e
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->V:Lp9/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    .line 55
    :pswitch_f
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->G:Lp9/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
