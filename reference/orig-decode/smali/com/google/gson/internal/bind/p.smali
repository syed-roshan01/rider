.class public abstract Lcom/google/gson/internal/bind/p;
.super Ljava/lang/Object;


# static fields
.field public static final A:Lp7/b0;

.field public static final B:Lp7/b0;

.field public static final a:Lp7/b0;

.field public static final b:Lp7/b0;

.field public static final c:Lp7/k;

.field public static final d:Lp7/b0;

.field public static final e:Lp7/b0;

.field public static final f:Lp7/b0;

.field public static final g:Lp7/b0;

.field public static final h:Lp7/b0;

.field public static final i:Lp7/b0;

.field public static final j:Lp7/b0;

.field public static final k:Lp7/k;

.field public static final l:Lp7/b0;

.field public static final m:Lp7/k;

.field public static final n:Lp7/k;

.field public static final o:Lp7/k;

.field public static final p:Lp7/b0;

.field public static final q:Lp7/b0;

.field public static final r:Lp7/b0;

.field public static final s:Lp7/b0;

.field public static final t:Lp7/b0;

.field public static final u:Lp7/b0;

.field public static final v:Lp7/b0;

.field public static final w:Lp7/b0;

.field public static final x:Lp7/b0;

.field public static final y:Lp7/b0;

.field public static final z:Lp7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp7/k;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/lang/Class;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->a:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/BitSet;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->b:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lp7/k;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lp7/k;-><init>(I)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->c:Lp7/k;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapters$32;

    const-class v3, Ljava/lang/Boolean;

    invoke-direct {v2, v1, v3, v0}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    sput-object v2, Lcom/google/gson/internal/bind/p;->d:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapters$32;

    const-class v3, Ljava/lang/Byte;

    invoke-direct {v2, v1, v3, v0}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    sput-object v2, Lcom/google/gson/internal/bind/p;->e:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapters$32;

    const-class v3, Ljava/lang/Short;

    invoke-direct {v2, v1, v3, v0}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    sput-object v2, Lcom/google/gson/internal/bind/p;->f:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapters$32;

    const-class v3, Ljava/lang/Integer;

    invoke-direct {v2, v1, v3, v0}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    sput-object v2, Lcom/google/gson/internal/bind/p;->g:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->h:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->i:Lp7/b0;

    new-instance v0, Lp7/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->j:Lp7/b0;

    new-instance v0, Lp7/k;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sput-object v0, Lcom/google/gson/internal/bind/p;->k:Lp7/k;

    new-instance v0, Lp7/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapters$32;

    const-class v3, Ljava/lang/Character;

    invoke-direct {v2, v1, v3, v0}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    sput-object v2, Lcom/google/gson/internal/bind/p;->l:Lp7/b0;

    new-instance v0, Lp7/k;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lp7/k;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lp7/k;-><init>(I)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->m:Lp7/k;

    new-instance v1, Lp7/k;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lp7/k;-><init>(I)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->n:Lp7/k;

    new-instance v1, Lp7/k;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lp7/k;-><init>(I)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->o:Lp7/k;

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->p:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->q:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/lang/StringBuffer;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->r:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/net/URL;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->s:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/net/URI;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->t:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$34;

    const-class v2, Ljava/net/InetAddress;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$34;-><init>(Ljava/lang/Class;Lp7/k;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->u:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/UUID;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->v:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    invoke-virtual {v0}, Lp7/a0;->a()Lp7/l;

    move-result-object v0

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/Currency;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->w:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$33;

    invoke-direct {v1, v0}, Lcom/google/gson/internal/bind/TypeAdapters$33;-><init>(Lp7/k;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->x:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$31;

    const-class v2, Ljava/util/Locale;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->y:Lp7/b0;

    new-instance v0, Lp7/k;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lp7/k;-><init>(I)V

    sput-object v0, Lcom/google/gson/internal/bind/p;->z:Lp7/k;

    new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$34;

    const-class v2, Lp7/p;

    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/bind/TypeAdapters$34;-><init>(Ljava/lang/Class;Lp7/k;)V

    sput-object v1, Lcom/google/gson/internal/bind/p;->A:Lp7/b0;

    new-instance v0, Lcom/google/gson/internal/bind/TypeAdapters$29;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/TypeAdapters$29;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/p;->B:Lp7/b0;

    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)Lp7/b0;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/TypeAdapters$32;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$32;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp7/a0;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Class;Lp7/a0;)Lp7/b0;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/TypeAdapters$31;

    invoke-direct {v0, p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$31;-><init>(Ljava/lang/Class;Lp7/a0;)V

    return-object v0
.end method
