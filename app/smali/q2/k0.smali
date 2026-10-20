.class public final Lq2/k0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/Notification$Builder;

.field public final c:Lq2/x;

.field public final d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lq2/x;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, Lq2/k0;->d:Landroid/os/Bundle;

    iput-object v1, v0, Lq2/k0;->c:Lq2/x;

    iget-object v2, v1, Lq2/x;->a:Landroid/content/Context;

    iput-object v2, v0, Lq2/k0;->a:Landroid/content/Context;

    iget-object v3, v1, Lq2/x;->r:Ljava/lang/String;

    invoke-static {v2, v3}, Lq2/g0;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iput-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-object v4, v1, Lq2/x;->t:Landroid/app/Notification;

    iget-wide v5, v4, Landroid/app/Notification;->when:J

    invoke-virtual {v3, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->icon:I

    iget v7, v4, Landroid/app/Notification;->iconLevel:I

    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v4, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v4, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->ledARGB:I

    iget v8, v4, Landroid/app/Notification;->ledOnMS:I

    iget v9, v4, Landroid/app/Notification;->ledOffMS:I

    invoke-virtual {v5, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->flags:I

    and-int/lit8 v6, v6, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v6, :cond_0

    move v6, v9

    goto :goto_0

    :cond_0
    move v6, v8

    :goto_0
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->flags:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_1

    move v6, v9

    goto :goto_1

    :cond_1
    move v6, v8

    :goto_1
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->flags:I

    and-int/lit8 v6, v6, 0x10

    if-eqz v6, :cond_2

    move v6, v9

    goto :goto_2

    :cond_2
    move v6, v8

    :goto_2
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->defaults:I

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, Lq2/x;->e:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, Lq2/x;->f:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, Lq2/x;->g:Landroid/app/PendingIntent;

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v4, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v4, Landroid/app/Notification;->flags:I

    and-int/lit16 v6, v6, 0x80

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    move v9, v8

    :goto_3
    invoke-virtual {v5, v7, v9}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v1, Lq2/x;->i:I

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v5

    invoke-virtual {v5, v8, v8, v8}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    iget-object v5, v1, Lq2/x;->h:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v5, :cond_4

    move-object v2, v7

    goto :goto_4

    :cond_4
    invoke-static {v5, v2}, Lv2/c;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    :goto_4
    invoke-static {v3, v2}, Lq2/e0;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    invoke-static {v3, v7}, Lq2/z;->c(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    invoke-static {v2, v8}, Lq2/z;->d(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v1, Lq2/x;->j:I

    invoke-static {v2, v3}, Lq2/z;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v2, v1, Lq2/x;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v5, 0x1d

    const/16 v6, 0x1c

    const-string v9, "android.support.allowGeneratedReplies"

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq2/p;

    iget-object v10, v3, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v10, :cond_5

    iget v10, v3, Lq2/p;->e:I

    if-eqz v10, :cond_5

    invoke-static {v10}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v10

    iput-object v10, v3, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    :cond_5
    iget-object v10, v3, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v10, :cond_6

    invoke-static {v10, v7}, Lv2/c;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v10

    goto :goto_6

    :cond_6
    move-object v10, v7

    :goto_6
    iget-object v11, v3, Lq2/p;->f:Ljava/lang/CharSequence;

    iget-object v12, v3, Lq2/p;->g:Landroid/app/PendingIntent;

    invoke-static {v10, v11, v12}, Lq2/e0;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v10

    iget-object v11, v3, Lq2/p;->a:Landroid/os/Bundle;

    if-eqz v11, :cond_7

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_7

    :cond_7
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    :goto_7
    iget-boolean v11, v3, Lq2/p;->c:Z

    invoke-virtual {v12, v9, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v10, v11}, Lq2/f0;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    const-string v11, "android.support.action.semanticAction"

    invoke-virtual {v12, v11, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-lt v9, v6, :cond_8

    invoke-static {v10, v8}, Lq2/h0;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_8
    if-lt v9, v5, :cond_9

    invoke-static {v10, v8}, Lq2/i0;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_9
    const/16 v5, 0x1f

    if-lt v9, v5, :cond_a

    invoke-static {v10, v8}, Lq2/j0;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_a
    const-string v5, "android.support.action.showsUserInterface"

    iget-boolean v3, v3, Lq2/p;->d:Z

    invoke-virtual {v12, v5, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v10, v12}, Lq2/c0;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v10}, Lq2/c0;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v5

    invoke-static {v3, v5}, Lq2/c0;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    goto :goto_5

    :cond_b
    iget-object v2, v1, Lq2/x;->o:Landroid/os/Bundle;

    if-eqz v2, :cond_c

    iget-object v3, v0, Lq2/k0;->d:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_c
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-boolean v10, v1, Lq2/x;->k:Z

    invoke-static {v3, v10}, Lq2/a0;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-boolean v10, v1, Lq2/x;->m:Z

    invoke-static {v3, v10}, Lq2/c0;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v3, v7}, Lq2/c0;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v3, v7}, Lq2/c0;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v3, v8}, Lq2/c0;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-object v10, v1, Lq2/x;->n:Ljava/lang/String;

    invoke-static {v3, v10}, Lq2/d0;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget v10, v1, Lq2/x;->p:I

    invoke-static {v3, v10}, Lq2/d0;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget v10, v1, Lq2/x;->q:I

    invoke-static {v3, v10}, Lq2/d0;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v3, v7}, Lq2/d0;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-object v10, v4, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v4, v4, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v3, v10, v4}, Lq2/d0;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    iget-object v3, v1, Lq2/x;->c:Ljava/util/ArrayList;

    iget-object v4, v1, Lq2/x;->u:Ljava/util/ArrayList;

    if-ge v2, v6, :cond_11

    if-nez v3, :cond_d

    move-object v2, v7

    goto :goto_8

    :cond_d
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_10

    :goto_8
    if-nez v2, :cond_e

    goto :goto_9

    :cond_e
    if-nez v4, :cond_f

    move-object v4, v2

    goto :goto_9

    :cond_f
    new-instance v10, Lq/g;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v12

    add-int/2addr v12, v11

    invoke-direct {v10, v12}, Lq/g;-><init>(I)V

    invoke-virtual {v10, v2}, Lq/g;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v10, v4}, Lq/g;->addAll(Ljava/util/Collection;)Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_9

    :cond_10
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    throw v7

    :cond_11
    :goto_9
    if-eqz v4, :cond_12

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v10, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v10, v4}, Lq2/d0;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_a

    :cond_12
    iget-object v2, v1, Lq2/x;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_1a

    iget-object v4, v1, Lq2/x;->o:Landroid/os/Bundle;

    if-nez v4, :cond_13

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    iput-object v4, v1, Lq2/x;->o:Landroid/os/Bundle;

    :cond_13
    iget-object v4, v1, Lq2/x;->o:Landroid/os/Bundle;

    const-string v10, "android.car.EXTENSIONS"

    invoke-virtual {v4, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_14

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    :cond_14
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    move v13, v8

    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v13, v14, :cond_18

    invoke-static {v13}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lq2/p;

    sget-object v16, Lq2/l0;->a:Ljava/lang/Object;

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v6, v15, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v6, :cond_15

    iget v6, v15, Lq2/p;->e:I

    if-eqz v6, :cond_15

    invoke-static {v6}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v6

    iput-object v6, v15, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    :cond_15
    iget-object v6, v15, Lq2/p;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v6, :cond_16

    invoke-virtual {v6}, Landroidx/core/graphics/drawable/IconCompat;->b()I

    move-result v6

    goto :goto_c

    :cond_16
    move v6, v8

    :goto_c
    const-string v8, "icon"

    invoke-virtual {v5, v8, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "title"

    iget-object v8, v15, Lq2/p;->f:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6, v8}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v6, "actionIntent"

    iget-object v8, v15, Lq2/p;->g:Landroid/app/PendingIntent;

    invoke-virtual {v5, v6, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v6, v15, Lq2/p;->a:Landroid/os/Bundle;

    if-eqz v6, :cond_17

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_d

    :cond_17
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    :goto_d
    iget-boolean v6, v15, Lq2/p;->c:Z

    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v6, "extras"

    invoke-virtual {v5, v6, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v6, "remoteInputs"

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    const-string v6, "showsUserInterface"

    iget-boolean v8, v15, Lq2/p;->d:Z

    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v6, "semanticAction"

    const/4 v8, 0x0

    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v12, v14, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v13, v13, 0x1

    const/16 v5, 0x1d

    const/16 v6, 0x1c

    const/4 v8, 0x0

    goto :goto_b

    :cond_18
    const-string v2, "invisible_actions"

    invoke-virtual {v4, v2, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v11, v2, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v2, v1, Lq2/x;->o:Landroid/os/Bundle;

    if-nez v2, :cond_19

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v1, Lq2/x;->o:Landroid/os/Bundle;

    :cond_19
    iget-object v2, v1, Lq2/x;->o:Landroid/os/Bundle;

    invoke-virtual {v2, v10, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v2, v0, Lq2/k0;->d:Landroid/os/Bundle;

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-object v5, v1, Lq2/x;->o:Landroid/os/Bundle;

    invoke-static {v4, v5}, Lq2/b0;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v4, v7}, Lq2/f0;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lq2/g0;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v4, v7}, Lq2/g0;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v4, v7}, Lq2/g0;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    const-wide/16 v8, 0x0

    invoke-static {v4, v8, v9}, Lq2/g0;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v4, v5}, Lq2/g0;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v4, v1, Lq2/x;->r:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1b

    iget-object v4, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v4, v7}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, v5, v5, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_1b
    const/16 v4, 0x1c

    if-lt v2, v4, :cond_1c

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    const/16 v3, 0x1d

    goto :goto_e

    :cond_1d
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    throw v7

    :goto_e
    if-lt v2, v3, :cond_1e

    iget-object v2, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    iget-boolean v1, v1, Lq2/x;->s:Z

    invoke-static {v2, v1}, Lq2/i0;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v1, v0, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v1, v7}, Lq2/i0;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    :cond_1e
    return-void
.end method
