.class public final Lu1/c0;
.super Landroid/view/accessibility/AccessibilityNodeProvider;


# instance fields
.field public final synthetic a:Lu1/p0;


# direct methods
.method public constructor <init>(Lu1/p0;)V
    .locals 0

    iput-object p1, p0, Lu1/c0;->a:Lu1/p0;

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lu1/c0;->a:Lu1/p0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu1/p0;->i(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 25

    move/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, Lu1/c0;->a:Lu1/p0;

    iget-object v3, v2, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v3}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v4, v4, Lu1/q;->a:Landroidx/lifecycle/w;

    if-eqz v4, :cond_0

    invoke-interface {v4}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    sget-object v6, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/q;

    if-ne v4, v6, :cond_1

    :goto_1
    const/4 v5, 0x0

    goto/16 :goto_2c

    :cond_1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    new-instance v6, Lc3/k;

    invoke-direct {v6, v4}, Lc3/k;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-virtual {v2}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu1/s2;

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v8, -0x1

    iget-object v9, v7, Lu1/s2;->a:Ly1/o;

    if-ne v0, v8, :cond_4

    sget-object v10, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v3}, Lb3/b0;->f(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v10

    instance-of v11, v10, Landroid/view/View;

    if-eqz v11, :cond_3

    check-cast v10, Landroid/view/View;

    goto :goto_2

    :cond_3
    const/4 v10, 0x0

    :goto_2
    iput v8, v6, Lc3/k;->b:I

    invoke-virtual {v4, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    goto :goto_5

    :cond_4
    invoke-virtual {v9}, Ly1/o;->i()Ly1/o;

    move-result-object v10

    if-eqz v10, :cond_5

    iget v10, v10, Ly1/o;->g:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_80

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v3}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v11

    invoke-virtual {v11}, Ly1/p;->a()Ly1/o;

    move-result-object v11

    iget v11, v11, Ly1/o;->g:I

    if-ne v10, v11, :cond_6

    goto :goto_4

    :cond_6
    move v8, v10

    :goto_4
    iput v8, v6, Lc3/k;->b:I

    invoke-virtual {v4, v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    :goto_5
    iput v0, v6, Lc3/k;->c:I

    invoke-virtual {v4, v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    invoke-virtual {v2, v7}, Lu1/p0;->j(Lu1/s2;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    const-string v7, "android.view.View"

    invoke-virtual {v6, v7}, Lc3/k;->g(Ljava/lang/String;)V

    iget-object v7, v9, Ly1/o;->d:Ly1/j;

    sget-object v8, Ly1/r;->s:Ly1/u;

    invoke-static {v7, v8}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly1/g;

    const/4 v8, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    iget-object v12, v9, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iget-object v13, v9, Ly1/o;->d:Ly1/j;

    const/4 v14, 0x4

    if-eqz v7, :cond_c

    iget-boolean v15, v9, Ly1/o;->e:Z

    if-nez v15, :cond_7

    invoke-virtual {v9, v10, v11}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_c

    :cond_7
    iget v15, v7, Ly1/g;->a:I

    invoke-static {v15, v14}, Ly1/g;->a(II)Z

    move-result v16

    const-string v5, "AccessibilityNodeInfo.roleDescription"

    if-eqz v16, :cond_8

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    const v14, 0x7f0e0090

    invoke-virtual {v15, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v4}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual {v15, v5, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_8
    invoke-static {v15, v8}, Ly1/g;->a(II)Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    const v15, 0x7f0e008f

    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v4}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual {v15, v5, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_9
    invoke-static {v15}, Lu1/r0;->c(I)Ljava/lang/String;

    move-result-object v5

    const/4 v14, 0x5

    invoke-static {v15, v14}, Ly1/g;->a(II)Z

    move-result v14

    if-eqz v14, :cond_b

    iget-boolean v14, v9, Ly1/o;->e:Z

    if-nez v14, :cond_a

    invoke-virtual {v9, v10, v11}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_a

    sget-object v14, Ly1/n;->b:Ly1/n;

    invoke-static {v12, v14}, Lo1/s;->v(Landroidx/compose/ui/node/a;Ly1/n;)Landroidx/compose/ui/node/a;

    move-result-object v14

    if-nez v14, :cond_a

    goto :goto_6

    :cond_a
    iget-boolean v14, v13, Ly1/j;->b:Z

    if-eqz v14, :cond_c

    :cond_b
    :goto_6
    invoke-virtual {v6, v5}, Lc3/k;->g(Ljava/lang/String;)V

    :cond_c
    :goto_7
    sget-object v5, Ly1/i;->h:Ly1/u;

    iget-object v14, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v14, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "android.widget.EditText"

    invoke-virtual {v6, v5}, Lc3/k;->g(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v14, Ly1/r;->u:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const-string v5, "android.widget.TextView"

    invoke-virtual {v6, v5}, Lc3/k;->g(Ljava/lang/String;)V

    :cond_e
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    invoke-static {v9}, Lu1/r0;->g(Ly1/o;)Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    invoke-virtual {v9, v10, v11}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v14

    move v15, v10

    :goto_8
    if-ge v15, v14, :cond_10

    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Ly1/o;

    invoke-virtual {v2}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v10

    iget v11, v8, Ly1/o;->g:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {v3}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v10

    invoke-virtual {v10}, Lu1/j1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v10

    iget-object v11, v8, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-virtual {v10, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, La7/a;->w(Ljava/lang/Object;)V

    iget v8, v8, Ly1/o;->g:I

    invoke-virtual {v4, v3, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    :cond_f
    add-int/lit8 v15, v15, 0x1

    const/4 v8, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_8

    :cond_10
    iget v5, v2, Lu1/p0;->t:I

    iget-object v8, v6, Lc3/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-ne v0, v5, :cond_11

    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    sget-object v5, Lc3/e;->d:Lc3/e;

    invoke-virtual {v6, v5}, Lc3/k;->b(Lc3/e;)V

    goto :goto_9

    :cond_11
    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    sget-object v5, Lc3/e;->c:Lc3/e;

    invoke-virtual {v6, v5}, Lc3/k;->b(Lc3/e;)V

    :goto_9
    invoke-virtual {v2, v9}, Lu1/p0;->u(Ly1/o;)Landroid/text/SpannableString;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    sget-object v5, Ly1/r;->D:Ly1/u;

    iget-object v10, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    const/4 v11, 0x1

    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_12

    const/4 v5, 0x0

    :cond_12
    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    :cond_13
    invoke-virtual {v2, v9}, Lu1/p0;->t(Ly1/o;)Ljava/lang/String;

    move-result-object v5

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1e

    if-lt v11, v14, :cond_14

    invoke-static {v8, v5}, Lc3/g;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_a

    :cond_14
    invoke-static {v8}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v11

    const-string v14, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v11, v14, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_a
    invoke-static {v9}, Lu1/p0;->s(Ly1/o;)Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    sget-object v5, Ly1/r;->B:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_15

    const/4 v5, 0x0

    :cond_15
    check-cast v5, Lz1/a;

    if-eqz v5, :cond_17

    sget-object v11, Lz1/a;->a:Lz1/a;

    if-ne v5, v11, :cond_16

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    goto :goto_b

    :cond_16
    sget-object v11, Lz1/a;->b:Lz1/a;

    if-ne v5, v11, :cond_17

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    :cond_17
    :goto_b
    sget-object v5, Ly1/r;->A:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_18

    const/4 v5, 0x0

    :cond_18
    check-cast v5, Ljava/lang/Boolean;

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v7, :cond_19

    goto :goto_c

    :cond_19
    iget v7, v7, Ly1/g;->a:I

    const/4 v11, 0x4

    invoke-static {v7, v11}, Ly1/g;->a(II)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    goto :goto_d

    :cond_1a
    :goto_c
    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    :cond_1b
    :goto_d
    iget-boolean v5, v13, Ly1/j;->b:Z

    if-eqz v5, :cond_1c

    const/4 v5, 0x0

    const/4 v7, 0x1

    invoke-virtual {v9, v5, v7}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1e

    :cond_1c
    sget-object v5, Ly1/r;->a:Ly1/u;

    invoke-static {v13, v5}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_1d

    invoke-static {v5}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_e

    :cond_1d
    const/4 v5, 0x0

    :goto_e
    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1e
    sget-object v5, Ly1/r;->t:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1f

    const/4 v5, 0x0

    :cond_1f
    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_21

    move-object v7, v9

    :goto_f
    if-eqz v7, :cond_21

    sget-object v11, Ly1/s;->a:Ly1/u;

    iget-object v14, v7, Ly1/o;->d:Ly1/j;

    iget-object v15, v14, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v15, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_20

    invoke-virtual {v14, v11}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    goto :goto_10

    :cond_20
    invoke-virtual {v7}, Ly1/o;->i()Ly1/o;

    move-result-object v7

    goto :goto_f

    :cond_21
    :goto_10
    sget-object v5, Ly1/r;->h:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_22

    const/4 v5, 0x0

    :cond_22
    check-cast v5, Lq8/l;

    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    const/16 v11, 0x1c

    if-eqz v5, :cond_24

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v11, :cond_23

    const/4 v5, 0x1

    invoke-static {v8, v5}, Lb2/l;->B(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_11

    :cond_23
    invoke-static {v8}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_24

    const/4 v14, 0x0

    invoke-virtual {v5, v7, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v15

    and-int/lit8 v14, v15, -0x3

    const/4 v15, 0x2

    or-int/2addr v14, v15

    invoke-virtual {v5, v7, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_24
    :goto_11
    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v14, Ly1/r;->C:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    sget-object v5, Ly1/i;->h:Ly1/u;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v4, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v14

    invoke-virtual {v4, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    sget-object v14, Ly1/r;->k:Ly1/u;

    invoke-interface {v10, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v4, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    move-result v15

    if-eqz v15, :cond_26

    invoke-virtual {v13, v14}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    invoke-virtual {v4, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v15

    if-eqz v15, :cond_25

    const/4 v15, 0x2

    invoke-virtual {v6, v15}, Lc3/k;->a(I)V

    goto :goto_12

    :cond_25
    const/4 v15, 0x1

    invoke-virtual {v6, v15}, Lc3/k;->a(I)V

    :cond_26
    :goto_12
    invoke-virtual {v9}, Ly1/o;->c()Lt1/c1;

    move-result-object v15

    if-eqz v15, :cond_27

    invoke-virtual {v15}, Lt1/c1;->Q0()Z

    move-result v15

    if-nez v15, :cond_28

    :cond_27
    sget-object v15, Ly1/r;->m:Ly1/u;

    iget-object v11, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v11, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    const/4 v11, 0x1

    goto :goto_13

    :cond_28
    const/4 v11, 0x0

    :goto_13
    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    sget-object v11, Ly1/r;->j:Ly1/u;

    invoke-virtual {v10, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_29

    const/4 v11, 0x0

    :cond_29
    check-cast v11, Ly1/e;

    if-eqz v11, :cond_2c

    iget v11, v11, Ly1/e;->a:I

    if-nez v11, :cond_2b

    :cond_2a
    const/4 v11, 0x1

    goto :goto_14

    :cond_2b
    const/4 v15, 0x1

    if-ne v11, v15, :cond_2a

    const/4 v11, 0x2

    :goto_14
    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    :cond_2c
    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    sget-object v11, Ly1/i;->b:Ly1/u;

    invoke-virtual {v10, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2d

    const/4 v11, 0x0

    :cond_2d
    check-cast v11, Ly1/a;

    if-eqz v11, :cond_2f

    sget-object v15, Ly1/r;->A:Ly1/u;

    invoke-virtual {v10, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_2e

    const/4 v15, 0x0

    :cond_2e
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v15, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v15, v1, 0x1

    invoke-virtual {v8, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v15

    if-eqz v15, :cond_2f

    if-nez v1, :cond_2f

    new-instance v1, Lc3/e;

    const/16 v15, 0x10

    iget-object v11, v11, Ly1/a;->a:Ljava/lang/String;

    move-object/from16 v18, v7

    const/4 v7, 0x0

    invoke-direct {v1, v7, v15, v11, v7}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    :goto_15
    const/4 v1, 0x0

    goto :goto_16

    :cond_2f
    move-object/from16 v18, v7

    goto :goto_15

    :goto_16
    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    sget-object v1, Ly1/i;->c:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_30

    const/4 v1, 0x0

    :cond_30
    check-cast v1, Ly1/a;

    const/16 v7, 0x20

    if-eqz v1, :cond_31

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v11

    if-eqz v11, :cond_31

    new-instance v11, Lc3/e;

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v11, v15, v7, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v11}, Lc3/k;->b(Lc3/e;)V

    :cond_31
    sget-object v1, Ly1/i;->n:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_32

    const/4 v1, 0x0

    :cond_32
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_33

    new-instance v11, Lc3/e;

    const/16 v15, 0x4000

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct {v11, v7, v15, v1, v7}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v11}, Lc3/k;->b(Lc3/e;)V

    :cond_33
    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_34

    const/4 v1, 0x0

    :cond_34
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_35

    new-instance v7, Lc3/e;

    const/high16 v11, 0x200000

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v7, v15, v11, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_35
    sget-object v1, Ly1/i;->m:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_36

    const/4 v1, 0x0

    :cond_36
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_37

    new-instance v7, Lc3/e;

    const v11, 0x1020054

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v7, v15, v11, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_37
    sget-object v1, Ly1/i;->o:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_38

    const/4 v1, 0x0

    :cond_38
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_39

    new-instance v7, Lc3/e;

    const/high16 v11, 0x10000

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v7, v15, v11, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_39
    sget-object v1, Ly1/i;->p:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3a

    const/4 v1, 0x0

    :cond_3a
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_3b

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v7

    if-eqz v7, :cond_3b

    invoke-virtual {v3}, Lu1/w;->getClipboardManager()Lu1/l;

    move-result-object v7

    iget-object v7, v7, Lu1/l;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v7}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v7

    if-eqz v7, :cond_3b

    const-string v11, "text/*"

    invoke-virtual {v7, v11}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3b

    new-instance v7, Lc3/e;

    const v11, 0x8000

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v7, v15, v11, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_3b
    invoke-static {v9}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_45

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3c

    goto/16 :goto_18

    :cond_3c
    invoke-virtual {v2, v9}, Lu1/p0;->q(Ly1/o;)I

    move-result v1

    invoke-virtual {v2, v9}, Lu1/p0;->p(Ly1/o;)I

    move-result v7

    invoke-virtual {v4, v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    sget-object v1, Ly1/i;->g:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    const/4 v1, 0x0

    :cond_3d
    check-cast v1, Ly1/a;

    new-instance v7, Lc3/e;

    if-eqz v1, :cond_3e

    iget-object v1, v1, Ly1/a;->a:Ljava/lang/String;

    goto :goto_17

    :cond_3e
    const/4 v1, 0x0

    :goto_17
    const/high16 v11, 0x20000

    const/4 v15, 0x0

    invoke-direct {v7, v15, v11, v1, v15}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    const/16 v1, 0x100

    invoke-virtual {v6, v1}, Lc3/k;->a(I)V

    const/16 v1, 0x200

    invoke-virtual {v6, v1}, Lc3/k;->a(I)V

    const/16 v1, 0xb

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    sget-object v1, Ly1/r;->a:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3f

    const/4 v1, 0x0

    :cond_3f
    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_40

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_45

    :cond_40
    sget-object v1, Ly1/i;->a:Ly1/u;

    invoke-interface {v10, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_42

    invoke-virtual {v10, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_41

    const/4 v1, 0x0

    :cond_41
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    goto :goto_18

    :cond_42
    sget-object v1, Lu1/s;->f:Lu1/s;

    invoke-static {v12, v1}, Lu1/r0;->d(Landroidx/compose/ui/node/a;Lu1/s;)Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_44

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object v1

    if-eqz v1, :cond_45

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_43

    const/4 v1, 0x0

    :cond_43
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    goto :goto_18

    :cond_44
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    move-result v1

    or-int/lit8 v1, v1, 0x14

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    :cond_45
    :goto_18
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v5, "androidx.compose.ui.semantics.id"

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lc3/k;->f()Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_47

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_46

    goto :goto_19

    :cond_46
    sget-object v5, Ly1/i;->a:Ly1/u;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_47

    const-string v5, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_47
    :goto_19
    sget-object v5, Ly1/r;->t:Ly1/u;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_48

    const-string v5, "androidx.compose.ui.semantics.testTag"

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_48
    sget-object v5, Lu1/j;->a:Lu1/j;

    invoke-virtual {v5, v4, v1}, Lu1/j;->a(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V

    sget-object v1, Ly1/r;->c:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_49

    const/4 v1, 0x0

    :cond_49
    check-cast v1, Ly1/f;

    if-eqz v1, :cond_4d

    sget-object v5, Ly1/i;->f:Ly1/u;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4a

    const-string v7, "android.widget.SeekBar"

    invoke-virtual {v6, v7}, Lc3/k;->g(Ljava/lang/String;)V

    goto :goto_1a

    :cond_4a
    const-string v7, "android.widget.ProgressBar"

    invoke-virtual {v6, v7}, Lc3/k;->g(Ljava/lang/String;)V

    :goto_1a
    sget-object v7, Ly1/f;->d:Ly1/f;

    iget v11, v1, Ly1/f;->a:F

    iget-object v14, v1, Ly1/f;->b:Li9/d;

    if-eq v1, v7, :cond_4b

    iget v1, v14, Li9/d;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v7, v14, Li9/d;->b:F

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/4 v15, 0x1

    invoke-static {v15, v1, v7, v11}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    :cond_4b
    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4d

    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v1

    if-eqz v1, :cond_4d

    iget v1, v14, Li9/d;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v5, v14, Li9/d;->a:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v1, v7}, Lz6/a;->m(FF)F

    move-result v1

    cmpg-float v1, v11, v1

    if-gez v1, :cond_4c

    sget-object v1, Lc3/e;->e:Lc3/e;

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    :cond_4c
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v5, v14, Li9/d;->b:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v1, v5}, Lz6/a;->o(FF)F

    move-result v1

    cmpl-float v1, v11, v1

    if-lez v1, :cond_4d

    sget-object v1, Lc3/e;->f:Lc3/e;

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    :cond_4d
    invoke-static {v6, v9}, Lu1/a0;->a(Lc3/k;Ly1/o;)V

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    sget-object v5, Ly1/r;->f:Ly1/u;

    invoke-static {v1, v5}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/b;

    if-eqz v1, :cond_4e

    iget v5, v1, Ly1/b;->a:I

    iget v1, v1, Ly1/b;->b:I

    const/4 v7, 0x0

    invoke-static {v5, v1, v7, v7}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    goto :goto_1f

    :cond_4e
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v7, Ly1/r;->e:Ly1/u;

    invoke-static {v5, v7}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_50

    const/4 v5, 0x0

    const/4 v7, 0x1

    invoke-virtual {v9, v5, v7}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_1b
    if-ge v7, v5, :cond_50

    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly1/o;

    invoke-virtual {v14}, Ly1/o;->h()Ly1/j;

    move-result-object v15

    move/from16 v19, v5

    sget-object v5, Ly1/r;->A:Ly1/u;

    iget-object v15, v15, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v15, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4f

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4f
    add-int/lit8 v7, v7, 0x1

    move/from16 v5, v19

    goto :goto_1b

    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    const/4 v7, 0x1

    xor-int/2addr v5, v7

    if-eqz v5, :cond_53

    invoke-static {v1}, Lo1/s;->k(Ljava/util/ArrayList;)Z

    move-result v5

    if-eqz v5, :cond_51

    const/4 v7, 0x1

    goto :goto_1c

    :cond_51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    :goto_1c
    if-eqz v5, :cond_52

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1d
    const/4 v5, 0x0

    goto :goto_1e

    :cond_52
    const/4 v1, 0x1

    goto :goto_1d

    :goto_1e
    invoke-static {v7, v1, v5, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    :cond_53
    :goto_1f
    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    sget-object v5, Ly1/r;->g:Ly1/u;

    invoke-static {v1, v5}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ly1/o;->i()Ly1/o;

    move-result-object v1

    if-nez v1, :cond_54

    goto/16 :goto_23

    :cond_54
    invoke-virtual {v1}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v7, Ly1/r;->e:Ly1/u;

    invoke-static {v5, v7}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v1}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v7, Ly1/r;->f:Ly1/u;

    invoke-static {v5, v7}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/b;

    if-eqz v5, :cond_55

    iget v7, v5, Ly1/b;->a:I

    if-ltz v7, :cond_5c

    iget v5, v5, Ly1/b;->b:I

    if-gez v5, :cond_55

    goto/16 :goto_23

    :cond_55
    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v7, Ly1/r;->A:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_56

    goto/16 :goto_23

    :cond_56
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v11, 0x1

    invoke-virtual {v1, v7, v11}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    const/4 v11, 0x0

    const/4 v14, 0x0

    :goto_20
    if-ge v11, v7, :cond_58

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly1/o;

    move-object/from16 v19, v1

    invoke-virtual {v15}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    move/from16 v20, v7

    sget-object v7, Ly1/r;->A:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_57

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v15, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->r()I

    move-result v1

    invoke-virtual {v12}, Landroidx/compose/ui/node/a;->r()I

    move-result v7

    if-ge v1, v7, :cond_57

    add-int/lit8 v14, v14, 0x1

    :cond_57
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v19

    move/from16 v7, v20

    goto :goto_20

    :cond_58
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v7, 0x1

    xor-int/2addr v1, v7

    if-eqz v1, :cond_5c

    invoke-static {v5}, Lo1/s;->k(Ljava/util/ArrayList;)Z

    move-result v1

    if-eqz v1, :cond_59

    const/16 v19, 0x0

    goto :goto_21

    :cond_59
    move/from16 v19, v14

    :goto_21
    const/16 v20, 0x1

    if-eqz v1, :cond_5a

    move/from16 v21, v14

    goto :goto_22

    :cond_5a
    const/16 v21, 0x0

    :goto_22
    const/16 v22, 0x1

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    sget-object v5, Ly1/r;->A:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_5b
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    const/16 v23, 0x0

    invoke-static/range {v19 .. v24}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    :cond_5c
    :goto_23
    sget-object v1, Ly1/r;->o:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5d

    const/4 v1, 0x0

    :cond_5d
    check-cast v1, Ly1/h;

    sget-object v5, Ly1/i;->d:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_5e

    const/4 v5, 0x0

    :cond_5e
    check-cast v5, Ly1/a;

    const/4 v7, 0x0

    if-eqz v1, :cond_65

    if-eqz v5, :cond_65

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v11

    sget-object v14, Ly1/r;->f:Ly1/u;

    invoke-static {v11, v14}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_60

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v11

    sget-object v14, Ly1/r;->e:Ly1/u;

    invoke-static {v11, v14}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_5f

    goto :goto_24

    :cond_5f
    const-string v11, "android.widget.HorizontalScrollView"

    invoke-virtual {v6, v11}, Lc3/k;->g(Ljava/lang/String;)V

    :cond_60
    :goto_24
    iget-object v11, v1, Ly1/h;->b:Lc9/a;

    invoke-interface {v11}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    cmpl-float v11, v11, v7

    if-lez v11, :cond_61

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_61
    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v11

    if-eqz v11, :cond_65

    invoke-static {v1}, Lu1/p0;->D(Ly1/h;)Z

    move-result v11

    sget-object v14, Lm2/l;->b:Lm2/l;

    if-eqz v11, :cond_63

    sget-object v11, Lc3/e;->e:Lc3/e;

    invoke-virtual {v6, v11}, Lc3/k;->b(Lc3/e;)V

    iget-object v11, v12, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-ne v11, v14, :cond_62

    sget-object v11, Lc3/e;->h:Lc3/e;

    goto :goto_25

    :cond_62
    sget-object v11, Lc3/e;->j:Lc3/e;

    :goto_25
    invoke-virtual {v6, v11}, Lc3/k;->b(Lc3/e;)V

    :cond_63
    invoke-static {v1}, Lu1/p0;->C(Ly1/h;)Z

    move-result v1

    if-eqz v1, :cond_65

    sget-object v1, Lc3/e;->f:Lc3/e;

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    iget-object v1, v12, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-ne v1, v14, :cond_64

    sget-object v1, Lc3/e;->j:Lc3/e;

    goto :goto_26

    :cond_64
    sget-object v1, Lc3/e;->h:Lc3/e;

    :goto_26
    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    :cond_65
    sget-object v1, Ly1/r;->p:Ly1/u;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_66

    const/4 v1, 0x0

    :cond_66
    check-cast v1, Ly1/h;

    if-eqz v1, :cond_6b

    if-eqz v5, :cond_6b

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v11, Ly1/r;->f:Ly1/u;

    invoke-static {v5, v11}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_68

    invoke-virtual {v9}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v11, Ly1/r;->e:Ly1/u;

    invoke-static {v5, v11}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_67

    goto :goto_27

    :cond_67
    const-string v5, "android.widget.ScrollView"

    invoke-virtual {v6, v5}, Lc3/k;->g(Ljava/lang/String;)V

    :cond_68
    :goto_27
    iget-object v5, v1, Ly1/h;->b:Lc9/a;

    invoke-interface {v5}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpl-float v5, v5, v7

    if-lez v5, :cond_69

    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_69
    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v5

    if-eqz v5, :cond_6b

    invoke-static {v1}, Lu1/p0;->D(Ly1/h;)Z

    move-result v5

    if-eqz v5, :cond_6a

    sget-object v5, Lc3/e;->e:Lc3/e;

    invoke-virtual {v6, v5}, Lc3/k;->b(Lc3/e;)V

    sget-object v5, Lc3/e;->i:Lc3/e;

    invoke-virtual {v6, v5}, Lc3/k;->b(Lc3/e;)V

    :cond_6a
    invoke-static {v1}, Lu1/p0;->C(Ly1/h;)Z

    move-result v1

    if-eqz v1, :cond_6b

    sget-object v1, Lc3/e;->f:Lc3/e;

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    sget-object v1, Lc3/e;->g:Lc3/e;

    invoke-virtual {v6, v1}, Lc3/k;->b(Lc3/e;)V

    :cond_6b
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v1, v5, :cond_6c

    invoke-static {v6, v9}, Lu1/b0;->a(Lc3/k;Ly1/o;)V

    :cond_6c
    sget-object v5, Ly1/r;->d:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6d

    const/4 v5, 0x0

    :cond_6d
    check-cast v5, Ljava/lang/CharSequence;

    const/16 v7, 0x1c

    if-lt v1, v7, :cond_6e

    invoke-static {v8, v5}, Lb2/l;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_28

    :cond_6e
    invoke-static {v8}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v7

    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v7, v11, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_28
    invoke-static {v9}, Lu1/r0;->a(Ly1/o;)Z

    move-result v5

    if-eqz v5, :cond_7a

    sget-object v5, Ly1/i;->q:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6f

    const/4 v5, 0x0

    :cond_6f
    check-cast v5, Ly1/a;

    if-eqz v5, :cond_70

    new-instance v7, Lc3/e;

    const/high16 v11, 0x40000

    iget-object v5, v5, Ly1/a;->a:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-direct {v7, v12, v11, v5, v12}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_70
    sget-object v5, Ly1/i;->r:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_71

    const/4 v5, 0x0

    :cond_71
    check-cast v5, Ly1/a;

    if-eqz v5, :cond_72

    new-instance v7, Lc3/e;

    const/high16 v11, 0x80000

    iget-object v5, v5, Ly1/a;->a:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-direct {v7, v12, v11, v5, v12}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_72
    sget-object v5, Ly1/i;->s:Ly1/u;

    invoke-virtual {v10, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_73

    const/4 v5, 0x0

    :cond_73
    check-cast v5, Ly1/a;

    if-eqz v5, :cond_74

    new-instance v7, Lc3/e;

    const/high16 v11, 0x100000

    iget-object v5, v5, Ly1/a;->a:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-direct {v7, v12, v11, v5, v12}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Lc3/k;->b(Lc3/e;)V

    :cond_74
    sget-object v5, Ly1/i;->u:Ly1/u;

    invoke-interface {v10, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7a

    invoke-virtual {v13, v5}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/16 v7, 0x20

    if-ge v6, v7, :cond_79

    new-instance v6, Lq/a0;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lq/a0;-><init>(I)V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v10, v2, Lu1/p0;->z:Lq/a0;

    iget-object v11, v10, Lq/a0;->a:[I

    iget v12, v10, Lq/a0;->c:I

    invoke-static {v12, v0, v11}, Lr/a;->a(II[I)I

    move-result v11

    if-ltz v11, :cond_77

    invoke-virtual {v10, v0}, Lq/a0;->c(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    sget-object v12, Lu1/p0;->X:[I

    invoke-static {v12}, Lb9/b;->Y([I)Ljava/util/ArrayList;

    move-result-object v12

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v14

    if-gtz v14, :cond_76

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-gtz v5, :cond_75

    const/4 v12, 0x0

    goto :goto_29

    :cond_75
    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    const/4 v12, 0x0

    throw v12

    :cond_76
    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    throw v12

    :cond_77
    const/4 v12, 0x0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-gtz v11, :cond_78

    :goto_29
    iget-object v5, v2, Lu1/p0;->y:Lq/a0;

    invoke-virtual {v5, v0, v6}, Lq/a0;->d(ILjava/lang/Object;)V

    invoke-virtual {v10, v0, v7}, Lq/a0;->d(ILjava/lang/Object;)V

    goto :goto_2a

    :cond_78
    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v12

    :cond_79
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t have more than 32 custom actions for one widget"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7a
    :goto_2a
    invoke-virtual {v2, v9}, Lu1/p0;->y(Ly1/o;)Z

    move-result v5

    const/16 v6, 0x1c

    if-lt v1, v6, :cond_7b

    invoke-static {v8, v5}, Lb2/l;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_2b

    :cond_7b
    invoke-static {v8}, Lc3/f;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_7c

    move-object/from16 v7, v18

    const/4 v6, 0x0

    invoke-virtual {v1, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    and-int/lit8 v6, v6, -0x2

    or-int/2addr v5, v6

    invoke-virtual {v1, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_7c
    :goto_2b
    iget-object v1, v2, Lu1/p0;->L:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_7d

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v3}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v5, v6}, Lu1/r0;->h(Lu1/j1;I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    iget-object v1, v2, Lu1/p0;->N:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v2, v0, v4, v1, v5}, Lu1/p0;->i(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7d
    iget-object v1, v2, Lu1/p0;->M:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_7e

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v3}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v3, v1}, Lu1/r0;->h(Lu1/j1;I)V

    :cond_7e
    move-object v5, v8

    :goto_2c
    iget-boolean v1, v2, Lu1/p0;->v:Z

    if-eqz v1, :cond_7f

    iget v1, v2, Lu1/p0;->t:I

    if-ne v0, v1, :cond_7f

    iput-object v5, v2, Lu1/p0;->u:Landroid/view/accessibility/AccessibilityNodeInfo;

    :cond_7f
    return-object v5

    :cond_80
    const-string v1, "semanticsNode "

    const-string v2, " has null parent"

    invoke-static {v1, v0, v2}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    iget-object p1, p0, Lu1/c0;->a:Lu1/p0;

    iget p1, p1, Lu1/p0;->t:I

    invoke-virtual {p0, p1}, Lu1/c0;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 19

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p0

    iget-object v4, v3, Lu1/c0;->a:Lu1/p0;

    invoke-virtual {v4}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu1/s2;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    iget-object v5, v5, Lu1/s2;->a:Ly1/o;

    if-nez v5, :cond_1

    :cond_0
    move v9, v6

    goto/16 :goto_2a

    :cond_1
    const/high16 v7, 0x10000

    const/4 v15, 0x1

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/16 v10, 0x40

    const/high16 v11, -0x80000000

    iget-object v12, v4, Lu1/p0;->d:Lu1/w;

    if-eq v1, v10, :cond_60

    const/16 v10, 0x80

    if-eq v1, v10, :cond_5f

    const/4 v7, 0x2

    const/16 v10, 0x200

    const/16 v11, 0x100

    iget v14, v5, Ly1/o;->g:I

    iget-object v13, v5, Ly1/o;->d:Ly1/j;

    if-eq v1, v11, :cond_3f

    if-eq v1, v10, :cond_3f

    const/16 v10, 0x4000

    if-eq v1, v10, :cond_3e

    const/high16 v10, 0x20000

    if-eq v1, v10, :cond_3a

    invoke-static {v5}, Lu1/r0;->a(Ly1/o;)Z

    move-result v10

    if-nez v10, :cond_2

    goto/16 :goto_2b

    :cond_2
    if-eq v1, v15, :cond_39

    if-eq v1, v7, :cond_38

    sget-object v7, Lm2/l;->b:Lm2/l;

    const/4 v10, 0x0

    iget-object v11, v5, Ly1/o;->c:Landroidx/compose/ui/node/a;

    sparse-switch v1, :sswitch_data_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    iget-object v2, v4, Lu1/p0;->y:Lq/a0;

    invoke-virtual {v2, v0}, Lq/a0;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/a0;

    if-eqz v0, :cond_63

    invoke-virtual {v0, v1}, Lq/a0;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-nez v0, :cond_3

    goto/16 :goto_2b

    :cond_3
    sget-object v0, Ly1/i;->u:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_4

    goto/16 :goto_2b

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_5

    goto/16 :goto_2b

    :cond_5
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v9

    :pswitch_0
    sget-object v0, Ly1/i;->y:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :pswitch_1
    sget-object v0, Ly1/i;->w:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :pswitch_2
    sget-object v0, Ly1/i;->x:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :pswitch_3
    sget-object v0, Ly1/i;->v:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_0
    sget-object v0, Ly1/i;->m:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_1
    if-eqz v2, :cond_63

    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_2b

    :cond_6
    sget-object v1, Ly1/i;->f:Ly1/u;

    invoke-static {v13, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/a;

    if-eqz v1, :cond_63

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/c;

    if-eqz v1, :cond_63

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_2
    invoke-virtual {v5}, Ly1/o;->i()Ly1/o;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v2, Ly1/i;->d:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    move-object v1, v9

    :cond_7
    check-cast v1, Ly1/a;

    goto :goto_0

    :cond_8
    move-object v1, v9

    :goto_0
    if-eqz v0, :cond_b

    if-eqz v1, :cond_9

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Ly1/o;->i()Ly1/o;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v2, Ly1/i;->d:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_a

    move-object v1, v9

    :cond_a
    check-cast v1, Ly1/a;

    goto :goto_0

    :cond_b
    :goto_1
    if-nez v0, :cond_c

    goto/16 :goto_2b

    :cond_c
    iget-object v2, v0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iget-object v4, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v4, v4, Lt1/x0;->b:Lt1/x;

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->b(Lt1/x;)Ld1/d;

    move-result-object v4

    iget-object v2, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->b:Lt1/x;

    invoke-virtual {v2}, Lt1/c1;->j()Lr1/s;

    move-result-object v2

    if-eqz v2, :cond_d

    sget-wide v12, Ld1/c;->b:J

    check-cast v2, Lt1/c1;

    invoke-virtual {v2, v12, v13}, Lt1/c1;->P(J)J

    move-result-wide v12

    goto :goto_2

    :cond_d
    sget-wide v12, Ld1/c;->b:J

    :goto_2
    invoke-virtual {v4, v12, v13}, Ld1/d;->g(J)Ld1/d;

    move-result-object v2

    invoke-virtual {v5}, Ly1/o;->c()Lt1/c1;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lt1/c1;->K0()Ly0/n;

    move-result-object v8

    iget-boolean v8, v8, Ly0/n;->t:Z

    if-eqz v8, :cond_e

    goto :goto_3

    :cond_e
    move-object v4, v9

    :goto_3
    if-eqz v4, :cond_f

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->k(Lr1/s;)J

    move-result-wide v12

    goto :goto_4

    :cond_f
    sget-wide v12, Ld1/c;->b:J

    :goto_4
    invoke-virtual {v5}, Ly1/o;->c()Lt1/c1;

    move-result-object v4

    if-eqz v4, :cond_10

    iget-wide v4, v4, Lr1/x0;->c:J

    goto :goto_5

    :cond_10
    const-wide/16 v4, 0x0

    :goto_5
    invoke-static {v4, v5}, Lo1/s;->m0(J)J

    move-result-wide v4

    invoke-static {v12, v13, v4, v5}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v4

    sget-object v5, Ly1/r;->o:Ly1/u;

    iget-object v0, v0, Ly1/o;->d:Ly1/j;

    invoke-static {v0, v5}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/h;

    sget-object v8, Ly1/r;->p:Ly1/u;

    iget-object v0, v0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_6

    :cond_11
    move-object v9, v0

    :goto_6
    check-cast v9, Ly1/h;

    iget v0, v4, Ld1/d;->a:F

    iget v8, v2, Ld1/d;->a:F

    sub-float/2addr v0, v8

    iget v8, v4, Ld1/d;->c:F

    iget v12, v2, Ld1/d;->c:F

    sub-float/2addr v8, v12

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v12

    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    move-result v13

    cmpg-float v12, v12, v13

    if-nez v12, :cond_13

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v12

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v13

    cmpg-float v12, v12, v13

    if-gez v12, :cond_12

    goto :goto_7

    :cond_12
    move v0, v8

    goto :goto_7

    :cond_13
    move v0, v10

    :goto_7
    if-eqz v5, :cond_14

    iget-boolean v5, v5, Ly1/h;->c:Z

    if-ne v5, v15, :cond_14

    neg-float v0, v0

    :cond_14
    iget-object v5, v11, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-ne v5, v7, :cond_15

    neg-float v0, v0

    :cond_15
    iget v5, v4, Ld1/d;->b:F

    iget v7, v2, Ld1/d;->b:F

    sub-float/2addr v5, v7

    iget v4, v4, Ld1/d;->d:F

    iget v2, v2, Ld1/d;->d:F

    sub-float/2addr v4, v2

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v2

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v7

    cmpg-float v2, v2, v7

    if-nez v2, :cond_17

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v2, v2, v7

    if-gez v2, :cond_16

    move v10, v5

    goto :goto_8

    :cond_16
    move v10, v4

    :cond_17
    :goto_8
    if-eqz v9, :cond_18

    iget-boolean v2, v9, Ly1/h;->c:Z

    if-ne v2, v15, :cond_18

    neg-float v10, v10

    :cond_18
    if-eqz v1, :cond_63

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/e;

    if-eqz v1, :cond_63

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_3
    if-eqz v2, :cond_19

    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_19
    move-object v0, v9

    :goto_9
    sget-object v1, Ly1/i;->h:Ly1/u;

    invoke-static {v13, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/a;

    if-eqz v1, :cond_63

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/c;

    if-eqz v1, :cond_63

    new-instance v2, La2/e;

    if-nez v0, :cond_1a

    const-string v0, ""

    :cond_1a
    const/4 v4, 0x6

    invoke-direct {v2, v0, v9, v4}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    invoke-interface {v1, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_4
    sget-object v0, Ly1/i;->s:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_5
    sget-object v0, Ly1/i;->r:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_6
    sget-object v0, Ly1/i;->q:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_7
    sget-object v0, Ly1/i;->o:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_8
    sget-object v0, Ly1/i;->p:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_63

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_63

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :pswitch_4
    :sswitch_9
    const/16 v0, 0x1000

    if-ne v1, v0, :cond_1b

    move v0, v15

    goto :goto_a

    :cond_1b
    move v0, v6

    :goto_a
    const/16 v2, 0x2000

    if-ne v1, v2, :cond_1c

    move v2, v15

    goto :goto_b

    :cond_1c
    move v2, v6

    :goto_b
    const v4, 0x1020039

    if-ne v1, v4, :cond_1d

    move v4, v15

    goto :goto_c

    :cond_1d
    move v4, v6

    :goto_c
    const v5, 0x102003b

    if-ne v1, v5, :cond_1e

    move v5, v15

    goto :goto_d

    :cond_1e
    move v5, v6

    :goto_d
    const v8, 0x1020038

    if-ne v1, v8, :cond_1f

    move v8, v15

    goto :goto_e

    :cond_1f
    move v8, v6

    :goto_e
    const v12, 0x102003a

    if-ne v1, v12, :cond_20

    move v1, v15

    goto :goto_f

    :cond_20
    move v1, v6

    :goto_f
    if-nez v4, :cond_22

    if-nez v5, :cond_22

    if-nez v0, :cond_22

    if-eqz v2, :cond_21

    goto :goto_10

    :cond_21
    move v12, v6

    goto :goto_11

    :cond_22
    :goto_10
    move v12, v15

    :goto_11
    if-nez v8, :cond_24

    if-nez v1, :cond_24

    if-nez v0, :cond_24

    if-eqz v2, :cond_23

    goto :goto_12

    :cond_23
    move v1, v6

    goto :goto_13

    :cond_24
    :goto_12
    move v1, v15

    :goto_13
    if-nez v0, :cond_25

    if-eqz v2, :cond_29

    :cond_25
    sget-object v0, Ly1/r;->c:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/f;

    sget-object v14, Ly1/i;->f:Ly1/u;

    iget-object v6, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_26

    move-object v6, v9

    :cond_26
    check-cast v6, Ly1/a;

    if-eqz v0, :cond_29

    if-eqz v6, :cond_29

    iget-object v1, v0, Ly1/f;->b:Li9/d;

    iget v4, v1, Li9/d;->b:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iget v5, v1, Li9/d;->a:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v4, v7}, Lz6/a;->m(FF)F

    move-result v4

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    iget v1, v1, Li9/d;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v5, v1}, Lz6/a;->o(FF)F

    move-result v1

    iget v5, v0, Ly1/f;->c:I

    if-lez v5, :cond_27

    sub-float/2addr v4, v1

    add-int/2addr v5, v15

    int-to-float v1, v5

    :goto_14
    div-float/2addr v4, v1

    goto :goto_15

    :cond_27
    sub-float/2addr v4, v1

    const/16 v1, 0x14

    int-to-float v1, v1

    goto :goto_14

    :goto_15
    if-eqz v2, :cond_28

    neg-float v4, v4

    :cond_28
    iget-object v1, v6, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/c;

    if-eqz v1, :cond_2a

    iget v0, v0, Ly1/f;->a:F

    add-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :cond_29
    iget-object v0, v11, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->b(Lt1/x;)Ld1/d;

    move-result-object v0

    invoke-virtual {v0}, Ld1/d;->c()F

    move-result v6

    invoke-virtual {v0}, Ld1/d;->b()F

    move-result v0

    invoke-static {v6, v0}, Ld7/t;->j(FF)J

    move-result-wide v14

    sget-object v0, Ly1/i;->d:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-nez v0, :cond_2b

    :cond_2a
    :goto_16
    const/4 v6, 0x0

    goto/16 :goto_2b

    :cond_2b
    sget-object v6, Ly1/r;->o:Ly1/u;

    iget-object v13, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v13, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2c

    move-object v6, v9

    :cond_2c
    check-cast v6, Ly1/h;

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    if-eqz v6, :cond_32

    if-eqz v12, :cond_32

    invoke-static {v14, v15}, Ld1/f;->d(J)F

    move-result v12

    if-nez v4, :cond_2d

    if-eqz v2, :cond_2e

    :cond_2d
    neg-float v12, v12

    :cond_2e
    iget-boolean v9, v6, Ly1/h;->c:Z

    if-eqz v9, :cond_2f

    neg-float v12, v12

    :cond_2f
    iget-object v9, v11, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-ne v9, v7, :cond_31

    if-nez v4, :cond_30

    if-eqz v5, :cond_31

    :cond_30
    neg-float v12, v12

    :cond_31
    invoke-static {v6, v12}, Lu1/p0;->B(Ly1/h;F)Z

    move-result v4

    if-eqz v4, :cond_32

    check-cast v0, Lc9/e;

    if-eqz v0, :cond_2a

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :cond_32
    sget-object v4, Ly1/r;->p:Ly1/u;

    invoke-virtual {v13, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_33

    const/4 v9, 0x0

    goto :goto_17

    :cond_33
    move-object v9, v4

    :goto_17
    check-cast v9, Ly1/h;

    if-eqz v9, :cond_2a

    if-eqz v1, :cond_2a

    invoke-static {v14, v15}, Ld1/f;->b(J)F

    move-result v1

    if-nez v8, :cond_34

    if-eqz v2, :cond_35

    :cond_34
    neg-float v1, v1

    :cond_35
    iget-boolean v2, v9, Ly1/h;->c:Z

    if-eqz v2, :cond_36

    neg-float v1, v1

    :cond_36
    invoke-static {v9, v1}, Lu1/p0;->B(Ly1/h;F)Z

    move-result v2

    if-eqz v2, :cond_2a

    check-cast v0, Lc9/e;

    if-eqz v0, :cond_2a

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_a
    sget-object v0, Ly1/i;->c:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_2a

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_2a

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :sswitch_b
    sget-object v1, Ly1/i;->b:Ly1/u;

    invoke-static {v13, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/a;

    if-eqz v1, :cond_37

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/a;

    if-eqz v1, :cond_37

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    move-object/from16 v18, v1

    const/4 v1, 0x0

    goto :goto_18

    :cond_37
    const/4 v1, 0x0

    const/16 v18, 0x0

    :goto_18
    invoke-static {v4, v0, v15, v1, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    if-eqz v18, :cond_2a

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :cond_38
    sget-object v0, Ly1/r;->k:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-virtual {v12}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    check-cast v0, Lc1/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v15}, Lc1/f;->a(ZZ)V

    :goto_19
    move v6, v15

    goto/16 :goto_2b

    :cond_39
    sget-object v0, Ly1/i;->t:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_2a

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_2a

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :cond_3a
    if-eqz v2, :cond_3b

    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v16

    move/from16 v0, v16

    goto :goto_1a

    :cond_3b
    const/4 v1, -0x1

    move v0, v1

    :goto_1a
    if-eqz v2, :cond_3c

    const-string v6, "ACTION_ARGUMENT_SELECTION_END_INT"

    invoke-virtual {v2, v6, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    const/4 v1, 0x0

    goto :goto_1b

    :cond_3c
    const/4 v1, 0x0

    const/4 v13, -0x1

    :goto_1b
    invoke-virtual {v4, v5, v0, v13, v1}, Lu1/p0;->P(Ly1/o;IIZ)Z

    move-result v0

    if-eqz v0, :cond_3d

    invoke-virtual {v4, v14}, Lu1/p0;->E(I)I

    move-result v2

    const/4 v5, 0x0

    invoke-static {v4, v2, v1, v5, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    :cond_3d
    move v6, v0

    goto/16 :goto_2b

    :cond_3e
    sget-object v0, Ly1/i;->n:Ly1/u;

    invoke-static {v13, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/a;

    if-eqz v0, :cond_2a

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/a;

    if-eqz v0, :cond_2a

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto/16 :goto_2b

    :cond_3f
    if-eqz v2, :cond_5d

    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-ne v1, v11, :cond_40

    move v1, v15

    goto :goto_1c

    :cond_40
    const/4 v1, 0x0

    :goto_1c
    iget-object v6, v4, Lu1/p0;->B:Ljava/lang/Integer;

    if-nez v6, :cond_41

    :goto_1d
    const/4 v6, -0x1

    goto :goto_1e

    :cond_41
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v14, v6, :cond_42

    goto :goto_1d

    :goto_1e
    iput v6, v4, Lu1/p0;->A:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lu1/p0;->B:Ljava/lang/Integer;

    :cond_42
    invoke-static {v5}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5d

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_43

    goto/16 :goto_29

    :cond_43
    invoke-static {v5}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_45

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_44

    goto :goto_1f

    :cond_44
    if-eq v0, v15, :cond_50

    if-eq v0, v7, :cond_4e

    const/4 v7, 0x4

    if-eq v0, v7, :cond_48

    const/16 v9, 0x8

    if-eq v0, v9, :cond_46

    const/16 v9, 0x10

    if-eq v0, v9, :cond_48

    :cond_45
    :goto_1f
    const/4 v9, 0x0

    goto/16 :goto_21

    :cond_46
    sget-object v7, Lu1/f;->c:Lu1/f;

    if-nez v7, :cond_47

    new-instance v7, Lu1/f;

    invoke-direct {v7}, Lu1/b;-><init>()V

    sput-object v7, Lu1/f;->c:Lu1/f;

    :cond_47
    sget-object v7, Lu1/f;->c:Lu1/f;

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"

    invoke-static {v7, v9}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v7, Lu1/b;->a:Ljava/lang/String;

    :goto_20
    move-object v9, v7

    goto/16 :goto_21

    :cond_48
    sget-object v9, Ly1/i;->a:Ly1/u;

    iget-object v12, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v12, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_49

    goto :goto_1f

    :cond_49
    invoke-static {v13}, Lu1/p0;->w(Ly1/j;)La2/a0;

    move-result-object v9

    if-nez v9, :cond_4a

    goto :goto_1f

    :cond_4a
    if-ne v0, v7, :cond_4c

    sget-object v7, Lu1/d;->d:Lu1/d;

    if-nez v7, :cond_4b

    new-instance v7, Lu1/d;

    invoke-direct {v7}, Lu1/b;-><init>()V

    sput-object v7, Lu1/d;->d:Lu1/d;

    :cond_4b
    sget-object v7, Lu1/d;->d:Lu1/d;

    const-string v12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"

    invoke-static {v7, v12}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v7, Lu1/b;->a:Ljava/lang/String;

    iput-object v9, v7, Lu1/d;->c:La2/a0;

    goto :goto_20

    :cond_4c
    sget-object v7, Lu1/e;->e:Lu1/e;

    if-nez v7, :cond_4d

    new-instance v7, Lu1/e;

    invoke-direct {v7}, Lu1/b;-><init>()V

    new-instance v12, Landroid/graphics/Rect;

    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    sput-object v7, Lu1/e;->e:Lu1/e;

    :cond_4d
    sget-object v7, Lu1/e;->e:Lu1/e;

    const-string v12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"

    invoke-static {v7, v12}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v7, Lu1/b;->a:Ljava/lang/String;

    iput-object v9, v7, Lu1/e;->c:La2/a0;

    iput-object v5, v7, Lu1/e;->d:Ly1/o;

    goto :goto_20

    :cond_4e
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    sget-object v9, Lu1/h;->d:Lu1/h;

    if-nez v9, :cond_4f

    new-instance v9, Lu1/h;

    invoke-direct {v9}, Lu1/b;-><init>()V

    invoke-static {v7}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v7

    iput-object v7, v9, Lu1/h;->c:Ljava/text/BreakIterator;

    sput-object v9, Lu1/h;->d:Lu1/h;

    :cond_4f
    sget-object v7, Lu1/h;->d:Lu1/h;

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"

    invoke-static {v7, v9}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lu1/h;->e(Ljava/lang/String;)V

    goto :goto_20

    :cond_50
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    sget-object v9, Lu1/c;->d:Lu1/c;

    if-nez v9, :cond_51

    new-instance v9, Lu1/c;

    invoke-direct {v9}, Lu1/b;-><init>()V

    invoke-static {v7}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v7

    iput-object v7, v9, Lu1/c;->c:Ljava/text/BreakIterator;

    sput-object v9, Lu1/c;->d:Lu1/c;

    :cond_51
    sget-object v7, Lu1/c;->d:Lu1/c;

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"

    invoke-static {v7, v9}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lu1/c;->e(Ljava/lang/String;)V

    goto/16 :goto_20

    :goto_21
    if-nez v9, :cond_52

    goto/16 :goto_16

    :cond_52
    invoke-virtual {v4, v5}, Lu1/p0;->p(Ly1/o;)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_54

    if-eqz v1, :cond_53

    const/4 v6, 0x0

    goto :goto_22

    :cond_53
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    :goto_22
    move v7, v6

    :cond_54
    if-eqz v1, :cond_55

    invoke-interface {v9, v7}, Lu1/g;->b(I)[I

    move-result-object v6

    goto :goto_23

    :cond_55
    invoke-interface {v9, v7}, Lu1/g;->a(I)[I

    move-result-object v6

    :goto_23
    if-nez v6, :cond_56

    goto/16 :goto_16

    :cond_56
    const/4 v9, 0x0

    aget v12, v6, v9

    aget v6, v6, v15

    if-eqz v2, :cond_5a

    sget-object v2, Ly1/r;->a:Ly1/u;

    iget-object v7, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5a

    sget-object v2, Ly1/r;->x:Ly1/u;

    iget-object v7, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-virtual {v4, v5}, Lu1/p0;->q(Ly1/o;)I

    move-result v2

    const/4 v7, -0x1

    if-ne v2, v7, :cond_58

    if-eqz v1, :cond_57

    move v2, v12

    goto :goto_24

    :cond_57
    move v2, v6

    :cond_58
    :goto_24
    if-eqz v1, :cond_59

    move v7, v6

    goto :goto_25

    :cond_59
    move v7, v12

    :goto_25
    move v13, v7

    goto :goto_27

    :cond_5a
    if-eqz v1, :cond_5b

    move v2, v6

    goto :goto_26

    :cond_5b
    move v2, v12

    :goto_26
    move v13, v2

    :goto_27
    if-eqz v1, :cond_5c

    move v9, v11

    goto :goto_28

    :cond_5c
    move v9, v10

    :goto_28
    new-instance v1, Lu1/e0;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v16

    move-object v7, v1

    move-object v8, v5

    move v10, v0

    move v11, v12

    move v12, v6

    move v0, v13

    move-wide/from16 v13, v16

    invoke-direct/range {v7 .. v14}, Lu1/e0;-><init>(Ly1/o;IIIIJ)V

    iput-object v1, v4, Lu1/p0;->I:Lu1/e0;

    invoke-virtual {v4, v5, v2, v0, v15}, Lu1/p0;->P(Ly1/o;IIZ)Z

    goto/16 :goto_19

    :cond_5d
    :goto_29
    const/4 v9, 0x0

    :cond_5e
    :goto_2a
    move v6, v9

    goto :goto_2b

    :cond_5f
    move v9, v6

    iget v1, v4, Lu1/p0;->t:I

    if-ne v1, v0, :cond_5e

    iput v11, v4, Lu1/p0;->t:I

    const/4 v1, 0x0

    iput-object v1, v4, Lu1/p0;->u:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    invoke-static {v4, v0, v7, v1, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto/16 :goto_19

    :cond_60
    move v9, v6

    iget-object v1, v4, Lu1/p0;->n:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_5e

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v1

    if-eqz v1, :cond_5e

    iget v1, v4, Lu1/p0;->t:I

    if-ne v1, v0, :cond_61

    goto :goto_2a

    :cond_61
    const/4 v2, 0x0

    if-eq v1, v11, :cond_62

    invoke-static {v4, v1, v7, v2, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    :cond_62
    iput v0, v4, Lu1/p0;->t:I

    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    const v1, 0x8000

    invoke-static {v4, v0, v1, v2, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto/16 :goto_19

    :cond_63
    :goto_2b
    return v6

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_9
        0x2000 -> :sswitch_9
        0x8000 -> :sswitch_8
        0x10000 -> :sswitch_7
        0x40000 -> :sswitch_6
        0x80000 -> :sswitch_5
        0x100000 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x1020036 -> :sswitch_2
        0x102003d -> :sswitch_1
        0x1020054 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
