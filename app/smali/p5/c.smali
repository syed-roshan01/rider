.class public final Lp5/c;
.super Ljava/lang/Object;

# interfaces
.implements Lp5/d;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lq5/l;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lm5/f;

.field public final d:Lr5/d;

.field public final e:Ls5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ll5/u;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lp5/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lm5/f;Lq5/l;Lr5/d;Ls5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lp5/c;->c:Lm5/f;

    iput-object p3, p0, Lp5/c;->a:Lq5/l;

    iput-object p4, p0, Lp5/c;->d:Lr5/d;

    iput-object p5, p0, Lp5/c;->e:Ls5/c;

    return-void
.end method
